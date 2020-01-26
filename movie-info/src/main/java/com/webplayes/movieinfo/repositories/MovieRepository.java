package com.webplayes.movieinfo.repositories;

import com.webplayes.movieinfo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MovieRepository extends JpaRepository<Movie, UUID> {

    Movie findMovieByName(String name);
}
