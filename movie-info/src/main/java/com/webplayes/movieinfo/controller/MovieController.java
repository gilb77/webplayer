package com.webplayes.movieinfo.controller;

import com.webplayes.movieinfo.model.Movie;
import com.webplayes.movieinfo.service.MovieService;
import com.webplayes.movieinfo.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/")
public class MovieController {


    private MovieServiceImpl movieService;


    @GetMapping("movie/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable("name") String name) {
        Movie movie = Movie.builder().uuid(UUID.randomUUID()).name(name).build();
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
}
