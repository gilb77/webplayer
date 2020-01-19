package com.gil.mediaplayer.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;


@Data
@Builder
public class Movie {

    @JsonProperty("movieId")
     private UUID uuid;

    @NotBlank
    private String name;

    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private Date dateRelease;

    @JsonFormat(shape =  JsonFormat.Shape.STRING)
    private int length;
}
