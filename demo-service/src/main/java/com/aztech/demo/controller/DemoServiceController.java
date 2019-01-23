package com.aztech.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/app")
public class DemoServiceController {

@Value("${demo.config.message}")
private String message;

@GetMapping("/healthcheck")
    public String getBatchDetails() {
        return message;
    }

}
