package com.example.springlesson;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @PostMapping("/test")
    public void hello(){
        System.out.println("Hello");
    }

    @GetMapping("/say")
    public String say(){
        return "hello";
    }
}
