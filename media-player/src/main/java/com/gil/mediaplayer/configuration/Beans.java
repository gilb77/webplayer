package com.gil.mediaplayer.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class Beans {


    @Bean
    public WebClient.Builder WebClientMovieInfo() {
        return WebClient.builder();

    }


}
