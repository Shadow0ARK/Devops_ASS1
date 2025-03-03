package com.company.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
  
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to Shadow’s API Hub! 🕶️";
    }
}
