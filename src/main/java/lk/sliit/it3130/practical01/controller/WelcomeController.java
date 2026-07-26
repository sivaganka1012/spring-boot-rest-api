package lk.sliit.it3130.practical01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to IT3130 Practical 01 - Spring Boot is running!";
    }
}