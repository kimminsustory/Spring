package com.example.myapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    @Value("${weather.api.city}")
    private String city;

    @Value("${weather.api.units}")
    private String units;

    public String getWeather() {
        String url = String.format("%s?q=%s&units=%s&appid=%s", apiUrl, city, units, apiKey);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}

