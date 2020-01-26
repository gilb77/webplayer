package com.webplayes.movieinfo.service;

import com.webplayes.movieinfo.model.Movie;
import com.webplayes.movieinfo.repositories.MovieRepository;
import com.webplayes.movieinfo.web.MovieClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//import com.webplayes.movieinfo.repositories.MovieRepository;


@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    private final MovieClient movieClient;

    @Override
    public Movie getMovieByName(String name) {
        Movie movie = movieRepository.findMovieByName(name);
        if (movie != null)
            return movie;
        movie = movieClient.getInfoByName(name);
        movieRepository.save(movie);
        return movie;
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
