package com.webplayes.movieinfo.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class MovieTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeMovie() throws JsonProcessingException {
        Movie movie = getMovie();
        String jsonString = objectMapper.writeValueAsString(movie);
        System.out.println(jsonString);
    }

    @Test
    void testDesirealizeMovie() throws JsonProcessingException {
        String json = "{\"name\":\"Doom\",\"description\":null,\"dateRelease\":null,\"length\":\"0\",\"movieId\":\"b8d98fa5-05ab-49fb-a7b4-6cc8afdab5ff\"}";
        Movie movie = objectMapper.readValue(json,Movie.class);
        System.out.println(movie);
    }
}
