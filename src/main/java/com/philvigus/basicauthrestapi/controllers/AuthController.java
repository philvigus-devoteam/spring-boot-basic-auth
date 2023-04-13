package com.philvigus.basicauthrestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/public")
    public String allAccess() {
        return "This is accessible by everyone";
    }

    @GetMapping("/authed")
    public String authedAccess() {
        return "This is admin only";
    }
}
