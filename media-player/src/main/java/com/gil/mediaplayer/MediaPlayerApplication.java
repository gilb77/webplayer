package com.gil.mediaplayer;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class MediaPlayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MediaPlayerApplication.class, args);
    }
}
