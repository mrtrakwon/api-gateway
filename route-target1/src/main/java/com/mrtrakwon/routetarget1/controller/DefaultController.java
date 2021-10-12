package com.mrtrakwon.routetarget1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("")
    public String index() {
        return "response from Target1";
    }

}
