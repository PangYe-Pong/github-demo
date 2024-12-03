package com.example.githubdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/api/test")
    public String test(){
        return "hello world.";
    }
}
