package com.mrtrakwon.auth.controller;


import com.mrtrakwon.auth.token.MRTAuthToken;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("token")
public class TokenController {

    @GetMapping(
            value = "/generate",
            produces = "application/json"
    )
    public ResponseEntity<MRTAuthToken> generate() {

    }
}
