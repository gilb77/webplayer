package com.webplayes.movieinfo.model;

import java.util.UUID;

public class BaseTest {

    Movie getMovie() {
        return Movie.builder().uuid(UUID.randomUUID())
                .name("Doom").build();
    }

}
