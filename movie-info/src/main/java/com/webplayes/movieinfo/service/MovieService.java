package com.webplayes.movieinfo.service;


import com.webplayes.movieinfo.model.Movie;

public interface MovieService {

    Movie getMovieByName(String name);

    Movie getMovieByNameNDate();

    Movie saveMovie(Movie movie);


}
