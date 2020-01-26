package com.webplayes.movieinfo.controller;

import com.webplayes.movieinfo.model.Movie;
import com.webplayes.movieinfo.service.MovieService;
import com.webplayes.movieinfo.service.MovieServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/", produces = {"application/json"}, consumes = {"application/json"})
public class MovieController {

    private final MovieService movieService;


    @GetMapping("movie/{name}")
        public ResponseEntity<Movie> getMovieByName(@PathVariable("name") String name) {
        Movie movie = movieService.getMovieByName(name);
//        log.debug("Return the movie " + movie.toString());
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }


    @GetMapping("movie")
    public ResponseEntity<Movie> getMovie() {
        Movie movie = Movie.builder().uuid(UUID.randomUUID()).name("doom").build();
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
}
