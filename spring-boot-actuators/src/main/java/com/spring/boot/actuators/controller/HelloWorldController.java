package com.spring.boot.actuators.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/index")
    public String index() {
        return "Hello World from Spring Boot 2.0 Index Page";
    }

    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World from Spring Boot 2.0";
    }
}
