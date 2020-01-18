package com.webplayes.movieinfo.service;


import com.webplayes.movieinfo.model.Movie;

public interface MovieService {

    Movie getMovieByName();

    Movie getMovieByNameNDate();

    Movie saveMovie(Movie movie);


}
