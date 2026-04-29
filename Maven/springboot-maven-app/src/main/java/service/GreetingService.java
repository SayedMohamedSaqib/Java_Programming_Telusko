package com.telusko.springboot_maven_app.service;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service // Class contains business logic
public class GreetingService {

    public String getGreeting() {

        int hour = LocalTime.now().getHour();

        if (hour < 12) {
            return "Good Morning ☀️";
        } else if (hour < 18) {
            return "Good Afternoon 🌤️";
        } else {
            return "Good Evening 🌙";
        }
    }

    public String getCurrentTime() {
        return LocalTime.now().toString();
    }
}