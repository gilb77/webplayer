package com.webplayes.movieinfo.controller;

import com.webplayes.movieinfo.model.Movie;
import com.webplayes.movieinfo.service.MovieService;
import lombok.RequiredArgsConstructor;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/")
@Log4j2
public class MovieController {


    private final MovieService movieService;


    @GetMapping("movie/{name}")
    public ResponseEntity<Movie> getMovieByName(@PathVariable("name") String name) {
        Movie movie = movieService.getMovieByName();
        log.info("Return in response the movie " + name);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
}
