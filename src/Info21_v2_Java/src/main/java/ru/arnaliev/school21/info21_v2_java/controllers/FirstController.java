package ru.arnaliev.school21.info21_v2_java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/")
    public String homePage() {
        return "index";
    }
}
