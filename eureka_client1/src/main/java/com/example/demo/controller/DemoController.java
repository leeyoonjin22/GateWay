package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
@Log4j2
public class DemoController {
    @GetMapping("/")
    private String get() {

        return "여기가클라이언트1";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the First Service. !";
    }
}
