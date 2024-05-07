package com.example.Api_Interceptor.Middleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class BasicController {
    @GetMapping("/time")
    public String getCurrentTime(){
        return "the current date/time : " + LocalDateTime.now().toString();
    }
}
