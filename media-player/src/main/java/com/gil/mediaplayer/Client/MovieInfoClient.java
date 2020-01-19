package com.gil.mediaplayer.Client;


import com.gil.mediaplayer.model.Movie;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class MovieInfoClient {

    private String API_HOST = "http://movie-info/";
    private String MOVIE_INFO_PATH = "api/movie/";

    private final RestTemplate restTemplate;

    public MovieInfoClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Movie getMovieByName(String name) {
        return restTemplate.getForObject(API_HOST + MOVIE_INFO_PATH + name, Movie.class);
    }


}
