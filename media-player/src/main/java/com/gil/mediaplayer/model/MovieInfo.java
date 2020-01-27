package com.gil.mediaplayer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;


@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieInfo {

    @JsonProperty("uuid")
     private UUID uuid;

    @JsonProperty("title")
    private String name;

    @JsonProperty("plot")
    private String description;

    @JsonProperty("length")
    private String length;
}
