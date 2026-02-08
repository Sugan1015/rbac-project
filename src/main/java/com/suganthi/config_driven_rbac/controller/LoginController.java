package com.suganthi.config_driven_rbac.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
public class LoginController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> payload) {

        String username = payload.get("username");
        String password = payload.get("password");

        System.out.println("Login API called for user: " + username);

        return Map.of(
                "message", "Login successful",
                "username", username
        );
    }
}
