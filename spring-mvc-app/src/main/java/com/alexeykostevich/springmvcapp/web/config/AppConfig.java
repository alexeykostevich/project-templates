package com.alexeykostevich.springmvcapp.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.alexeykostevich.springmvcapp.persistence",
        "com.alexeykostevich.springmvcapp.web.controllers"
})
public class AppConfig {
}
