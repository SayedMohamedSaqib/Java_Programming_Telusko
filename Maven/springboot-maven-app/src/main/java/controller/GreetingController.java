package com.telusko.springboot_maven_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.springboot_maven_app.service.GreetingService;

@Controller
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String greet(Model model) {

        String message = service.getGreeting();
        String time = service.getCurrentTime();

        model.addAttribute("greeting", message);
        model.addAttribute("time", time);

        return "greeting"; // refers to greeting.html
    }
}