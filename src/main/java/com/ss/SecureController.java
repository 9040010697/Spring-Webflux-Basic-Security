package com.ss;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public String welcomeMessage() {
        return "Hi DJ...";
    }
}
