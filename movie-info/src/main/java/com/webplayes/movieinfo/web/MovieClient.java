package com.webplayes.movieinfo.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.webplayes.movieinfo.config.CustomObjectMapper;
import com.webplayes.movieinfo.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MovieClient {

    private final RestTemplate restTemplate;

    private final String MOVIE_INFO_API = "https://imdb-internet-movie-database-unofficial.p.rapidapi.com/film/doom";
    private final String X_RAPIDAPI_HOST = "imdb-internet-movie-database-unofficial.p.rapidapi.com";
    private final String X_RAPIDAPI_KEY = "061a31d7a2msh6b9ab7c9388786dp18f9cbjsneed24d47b00c";

    public Movie getInfoByName(String name){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-rapidapi-host", X_RAPIDAPI_HOST);
        headers.set("x-rapidapi-key", X_RAPIDAPI_KEY);

        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<Movie> respEntity = restTemplate.exchange(MOVIE_INFO_API, HttpMethod.GET, entity,Movie.class);
        return (Movie)respEntity.getBody();
    }



    //    private final CustomObjectMapper objectMapper;
//
//    public Movie getInfoByName(String name) throws IOException {
//        Response response = getMovieCall(name).execute();
//        return objectMapper.readValue(response.body().string(), Movie.class);
//    }
//
//
//    public Call getMovieCall(String name) {
//        String MOVIE_INFO_API = "https://imdb-internet-movie-database-unofficial.p.rapidapi.com/film/" + name;
//
//        String X_RAPIDAPI_HOST = "imdb-internet-movie-database-unofficial.p.rapidapi.com";
//
//        String X_RAPIDAPI_KEY = "061a31d7a2msh6b9ab7c9388786dp18f9cbjsneed24d47b00c";
//
//        Request request = new Request.Builder()
//                .url(MOVIE_INFO_API)
//                .get()
//                .addHeader("x-rapidapi-host", X_RAPIDAPI_HOST)
//                .addHeader("x-rapidapi-key", X_RAPIDAPI_KEY)
//                .build();
//        return new OkHttpClient().newCall(request);
//    }

}
