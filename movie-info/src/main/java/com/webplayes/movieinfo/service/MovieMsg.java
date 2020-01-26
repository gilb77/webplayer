package com.webplayes.movieinfo.service;

import com.webplayes.movieinfo.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieMsg {

    private final static String TOPIC = "movieInfoRes";


    private final KafkaTemplate<String, Movie> kafkaTemplate;

    private final MovieServiceImpl movieService;

    @KafkaListener(topics = "movieInfoReq", groupId = "group_id")
    public void getMovieInfoReq(String msgNameMovie) {
        Movie movie = movieService.getMovieByName(msgNameMovie);
        this.kafkaTemplate.send(TOPIC, movie);
    }


}
