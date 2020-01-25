package com.webplayes.movieinfo.web;

import com.webplayes.movieinfo.model.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MovieClientTest {

    @Autowired
    MovieClient movieClient;

    @Test
    void getMovieByName() {
        Movie movie = movieClient.getInfoByName("doom");
        System.out.println(movie);
    }
}
