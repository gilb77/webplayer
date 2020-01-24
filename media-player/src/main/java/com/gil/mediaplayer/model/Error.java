package com.gil.mediaplayer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Error {
    @JsonProperty("time")
    public String timestamp;
    public String error;
    public Integer status;
    public String path;

    @Override
    public String toString() {
        return "{" +
                "\"timestamp\":\"" + timestamp + '\"' +
                ", \"error\":\"" + error + '\"' +
                ", \"status\" : " + status +
                ", \"path\": \"" + path + '\"' +
                '}';
    }
}
