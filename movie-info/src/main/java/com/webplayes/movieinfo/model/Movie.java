package com.webplayes.movieinfo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@Data
@Entity
@Builder
@Table(name = "MOVIES")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @Column
    private UUID uuid;

    @Column
    @JsonProperty("title")
    private String name;

    @Column
    @JsonProperty("plot")
    private String description;

//    @Column
////    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @JsonProperty("year")
//    private String year;
    @JsonProperty("length")
    @Column
    private String length;
}
