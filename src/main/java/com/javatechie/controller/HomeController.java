package com.javatechie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Maps to src/main/resources/templates/index.html
    }

    @GetMapping("/success")
    public String handleError() {
        return "success"; // Maps to src/main/resources/templates/error.html
    }
}
