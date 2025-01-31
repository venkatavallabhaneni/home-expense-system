package com.mank.homeexpsys.general.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeExpenseController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, Kubernetes!";
    }
}
