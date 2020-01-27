package com.gil.mediaplayer.services.impl;

//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;


//@Service
//@RequiredArgsConstructor
//public class MovieInfoService {
//
//    private final static String TOPIC = "movieInfoReq";
//
//
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public void sendReqMovieInfo(String msgNameMovie) {
//        this.kafkaTemplate.send(TOPIC, msgNameMovie);
//    }
//
//    @KafkaListener(topics = "movieInfoRes", groupId = "group_id")
//    public void getMovieInfoReq(Movie msgMovie) {
//
//    }
//
//}
