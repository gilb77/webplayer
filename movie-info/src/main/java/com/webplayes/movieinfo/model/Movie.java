package com.webplayes.movieinfo.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.util.UUID;


@Data
@Builder
public class Movie {

     private UUID uuid;

    @NotBlank
    private String name;

    private String description;
    private String length;
}
