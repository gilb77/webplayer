package com.webplayes.movieinfo.service;

import com.webplayes.movieinfo.model.Movie;
//import com.webplayes.movieinfo.repositories.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service

public class MovieServiceImpl implements MovieService {

//    private MovieRepository movieRepository;


//    @Autowired
//    public MovieServiceImpl(MovieRepository movieRepository){
//        this.movieRepository = movieRepository;
//    }

    @Override
    public Movie getMovieByName() {
        return Movie.builder().uuid(UUID.randomUUID()).name("doom").build();
    }

    @Override
    public Movie getMovieByNameNDate() {
        return null;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return null;
    }
}
