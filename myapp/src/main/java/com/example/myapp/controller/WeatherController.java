package com.example.myapp.controller;

import com.example.myapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @ModelAttribute("weather")
    public String weather() {
        return weatherService.getWeather();
    }

    // 이 컨트롤러는 각 페이지로 날씨 데이터를 전달하는 역할
}

