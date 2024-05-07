package com.example.Api_Interceptor.Middleware1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LegacyController {
    public String getLegacyResponse(){
        return "This is just old code";
    }
}
