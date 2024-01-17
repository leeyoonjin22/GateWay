package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
@Log4j2
public class DemoController {

    @GetMapping("/")
    private String get() {

        return "여기가클라이언트2";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome to the Second Service.!";
    }
}
