package com.gil.mediaplayer.client;


import com.gil.mediaplayer.model.Movie;
import com.gil.mediaplayer.model.MovieInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * Created by jt on 2019-04-23.
 */
@Component
@RequiredArgsConstructor
public class MovieInfoClient {

    private final String GET_MOVIE = "api/movie/";

    private final WebClient.Builder webClient;

    public Movie getMovie(String name) {

        MovieInfo movieInfo = webClient.build().get().uri("http://localhost:8787/" + GET_MOVIE + name)
                .header("Content-Type", "application/json")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToMono(MovieInfo.class).block();
        return Movie.builder().movieInfo(movieInfo).build();
    }


}