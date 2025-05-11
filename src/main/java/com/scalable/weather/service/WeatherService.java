package com.scalable.weather.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.scalable.weather.dto.WeatherResponse;

@Service
public class WeatherService {
    public WeatherResponse getWeatherForCity(String city) {
        String API_KEY = "5796abbde9106b7da4febfae8c44c232";
        String WEATHER_LIBRARY_URI = "https://api.openweathermap.org/data/2.5/find?q=%s&appid=%s&units=metric";
        String WEATHER_LIBRARY_URL = String.format(WEATHER_LIBRARY_URI, city, API_KEY);

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(WEATHER_LIBRARY_URL, WeatherResponse.class);
    }
}
