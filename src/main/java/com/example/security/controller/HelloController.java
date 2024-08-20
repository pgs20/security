package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "This endpoint is public and can be accessed without authentication.";
    }

    @GetMapping("/private")
    public String privateEndpoint() {
        return "This endpoint is private and can only be accessed with authentication.";
    }
}
