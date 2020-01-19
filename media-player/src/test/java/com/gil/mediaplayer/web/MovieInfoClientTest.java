package com.gil.mediaplayer.web;

import com.gil.mediaplayer.Client.MovieInfoClient;
import com.gil.mediaplayer.model.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MovieInfoClientTest {

    @Autowired
    MovieInfoClient movieInfoClient;


    @Test
    void getMovieByName(){
        Movie movie = movieInfoClient.getMovieByName("doom");
        assertNotNull(movie);
    }

}
