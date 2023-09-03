package com.example.interceptorDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptController {

    @GetMapping("/get-data")
    public String getData() {
        return "reached controller";
    }

}
