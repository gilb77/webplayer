package com.gil.mediaplayer.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class IndexController {

    @Value("${video.location}")
    private String videoLocation;

    @GetMapping("/")
    public Mono<String> index() throws Exception{
        return Mono.just("index");
    }
}
