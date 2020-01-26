package com.webplayes.movieinfo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webplayes.movieinfo.config.CustomObjectMapper;
import com.webplayes.movieinfo.model.Movie;
import com.webplayes.movieinfo.repositories.MovieRepository;
import com.webplayes.movieinfo.service.MovieServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(MovieController.class)
class MovieControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    MovieServiceImpl movieService;

    @MockBean
    MovieRepository movieRepository;

    @Autowired
    CustomObjectMapper objectMapper;

    @Test
    void getMovieByName() throws Exception {
        Movie movie = getMovieDoom();

        String movieJson = objectMapper.writeValueAsString(movie);
        String responseJson = mockMvc.perform(get("/api/movie/" + "Doom").
                contentType(MediaType.APPLICATION_JSON).
                accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
//        assert responseJson.equals(movieJson);
    }


    Movie getMovieDoom() {
        return Movie.builder().name("Doom")
                .description("Space Marines are sent to investigate strange events at a research facility on " +
                        "Mars but find themselves at the mercy of genetically enhanced killing machines.").
                        length("1h 45min").uuid(null).build();
    }
}
