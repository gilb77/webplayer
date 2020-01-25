package com.webplayes.movieinfo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@Data
@Entity
@Builder
@Table(name = "MOVIES")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID uuid;

    @NotBlank
    @Column
    @JsonProperty("title")
    private String name;

    @Column
    @JsonProperty("plot")
    private String description;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @JsonProperty("year")
    private String year;



    @JsonProperty("length")
    @Column
    private int length;
}
