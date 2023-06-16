package com.knoldus.appservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/api/name")
    public String find(){
        return "Its me Anshika";
    }
}
