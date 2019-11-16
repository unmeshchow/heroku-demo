package com.unmeshc.herokudemo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by uc on 11/16/2019
 */
@RestController
public class HelloController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String sayHello() {
        return "Hello, I'm Unmesh Chowdhury";
    }
}
