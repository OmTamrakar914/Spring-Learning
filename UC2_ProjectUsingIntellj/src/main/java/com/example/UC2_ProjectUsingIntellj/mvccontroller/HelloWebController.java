package com.example.UC2_ProjectUsingIntellj.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HelloWebController {
    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    @GetMapping("/web/messege")
    public String messege(Model model) {
        model.addAttribute("messege", "This is a custom message");
        return "messege";
    }
}