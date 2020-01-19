package com.webplayes.movieinfo.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
public class MovieTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeMovie() throws JsonProcessingException {
        Movie movie = getMovie();
        String jsonString = objectMapper.writeValueAsString(movie);
        System.out.println(jsonString);
    }





}
