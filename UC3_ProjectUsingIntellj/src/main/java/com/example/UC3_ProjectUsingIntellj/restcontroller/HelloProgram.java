package com.example.UC3_ProjectUsingIntellj.restcontroller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProgram {

    @GetMapping("/api")
    public String hello(){
    return "Hello from Brigelabz!!";
    }

}
