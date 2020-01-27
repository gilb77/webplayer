package com.gil.mediaplayer.web;

import com.gil.mediaplayer.client.MovieInfoClient;
import com.gil.mediaplayer.model.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieClientTest {

    @Autowired
    MovieInfoClient movieInfoClient;

    @Test
    void getMovie() {
        Movie movie = movieInfoClient.getMovie("doom");
        System.out.println(movie);
    }
}
