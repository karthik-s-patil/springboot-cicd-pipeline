package com.example.Spring_boot_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String home() {
        return "CI/CD Pipeline Working Successfully 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is UP ✅";
    }
}