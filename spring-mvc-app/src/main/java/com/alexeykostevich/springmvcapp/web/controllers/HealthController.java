package com.alexeykostevich.springmvcapp.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexeykostevich.springmvcapp.web.models.HealthStatusResponse;

@RestController
public class HealthController {
    @GetMapping("/health")
    public HealthStatusResponse health() {
        return HealthStatusResponse.ok();
    }
}
