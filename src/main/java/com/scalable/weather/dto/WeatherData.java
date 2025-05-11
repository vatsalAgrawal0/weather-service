package com.scalable.weather.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    private long id;
    private String name;
    private Coord coord;
    private Main main;
    private long dt;
    private Wind wind;
    private Sys sys;
    private Object rain;
    private Object snow;
    private Clouds clouds;
    private List<Weather> weather;
}

