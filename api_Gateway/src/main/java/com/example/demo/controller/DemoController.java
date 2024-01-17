package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class DemoController {


    @GetMapping("/")
    private String get() {

        return "여기가apiGateway다!";
    }
}
