package com.mrtrakwon.zuulv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping(value = "/available")
    public String available() {
        return "Spring In Action";
    }

    @GetMapping(value = "/checked-out")
    public String checkOut() {
        return "Spring Boot In Action";
    }
}
