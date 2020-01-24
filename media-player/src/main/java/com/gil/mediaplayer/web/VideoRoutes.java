package com.gil.mediaplayer.web;

import com.gil.mediaplayer.web.errorHandlers.ErrorHandler;
import com.gil.mediaplayer.web.handlers.VideoRouteHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class VideoRoutes {

    @Bean
    RouterFunction<ServerResponse> videoRoute(VideoRouteHandler videoRouteHandler) {

        return route(GET("/video"), videoRouteHandler::returnPath)
                .andRoute(GET("/video/{name}"), videoRouteHandler::getVideoByName)
                .filter((request, next) -> next.handle(request)
                        .onErrorResume(throwable -> ErrorHandler.handleError(throwable, request)));
    }
}
