package com.atalibdev.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//@RequestMapping("/api/testing")
public class TestController {

    @GetMapping
    public ResponseEntity<Map<String, String>> healthCheck() {
        return ResponseEntity.ok(Map.of("Status", "Up and running"));
    }

    @GetMapping("/testing")
    public ResponseEntity<Map<String, String>> test() {
        return ResponseEntity.ok().body(Map.of("Spring Boot", "CI/CD Pipeline"));
    }
}
