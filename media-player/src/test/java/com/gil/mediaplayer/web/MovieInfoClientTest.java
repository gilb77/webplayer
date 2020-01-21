package com.gil.mediaplayer.web;


import com.gil.mediaplayer.client.MovieInfoClient;
import com.gil.mediaplayer.model.Movie;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
class MovieInfoClientTest {

    @Autowired
    private MovieInfoClient movieInfoClient;

    @Test
    void getMovie() {
        Movie movie = movieInfoClient.getMovie();
//        System.out.println(movie);
    }


}