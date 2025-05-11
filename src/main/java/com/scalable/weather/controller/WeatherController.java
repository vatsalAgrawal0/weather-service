package com.scalable.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scalable.weather.dto.WeatherResponse;
import com.scalable.weather.service.WeatherService;

@RestController
@RequestMapping("api/v1")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String returnHello() {
        return "Hello";
    }

    @GetMapping("/weather/{city}")
    public WeatherResponse getWeather(@PathVariable("city") String city) {
        return weatherService.getWeatherForCity(city);
    }
}