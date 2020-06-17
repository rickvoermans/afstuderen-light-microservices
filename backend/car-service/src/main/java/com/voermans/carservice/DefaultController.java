package com.voermans.carservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "welcome")
public class DefaultController {

    private static final String WELCOME = "Welkom bij de car-service API";

    @GetMapping
    public String welcomeEndpoint() {
        return WELCOME;
    }
}
