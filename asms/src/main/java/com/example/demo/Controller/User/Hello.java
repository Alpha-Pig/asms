package com.example.demo.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello{
    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
}
