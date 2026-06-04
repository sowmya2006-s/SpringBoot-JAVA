package com.telusko.simpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Helloooooooooooooooo U R Welcome 🚀";
    }

    @RequestMapping("/about")
    public String about() {
        return "I am Sowwwwwwwwwwwwwwwwwwww";
    }

}