package com.example.githubdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/")
    public String home() {
        return "indexIndex";
    }

    @GetMapping("/api/test")
    public String test(){
        return "hello world haa.";
    }
}
