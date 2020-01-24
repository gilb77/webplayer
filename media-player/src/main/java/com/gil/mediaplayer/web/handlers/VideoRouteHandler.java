package com.gil.mediaplayer.web.handlers;


import com.gil.mediaplayer.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.ResourceRegion;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.Exceptions;
import reactor.core.publisher.Mono;

@Component
public class VideoRouteHandler {

    private final VideoService videoService;

    @Autowired
    public VideoRouteHandler(VideoService videoService) {
        this.videoService = videoService;
    }

    public Mono<ServerResponse> returnPath(ServerRequest request) {
        return ServerResponse.ok().body(Mono.just(request.path()), String.class);
    }

    public Mono<ServerResponse> getVideoByName(ServerRequest request) {
        String name = request.pathVariable("name");
        HttpHeaders requestHeaders = request.headers().asHttpHeaders();
        Mono<UrlResource> videoResourceMono = videoService.getResourceByName(name);
        Mono<ResourceRegion> resourceRegionMono = videoService.getRegion(videoResourceMono, requestHeaders);

        return resourceRegionMono.zipWith(videoResourceMono, (resourceRegion, video) -> ServerResponse
                    .status(HttpStatus.PARTIAL_CONTENT)
                    .contentType(MediaTypeFactory.getMediaType(video)
                            .orElse(MediaType.APPLICATION_OCTET_STREAM))
                    .contentLength(resourceRegion.getCount())
                    .headers(headers -> headers.setCacheControl(CacheControl.noCache()))
                    .body(resourceRegionMono, ResourceRegion.class))
                .flatMap(serverResponseMono -> serverResponseMono)
                .doOnError(throwable -> {
                    throw Exceptions.propagate(throwable);
                });
    }

}