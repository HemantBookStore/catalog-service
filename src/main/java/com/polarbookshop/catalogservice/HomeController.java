package com.polarbookshop.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getGreeting() throws InterruptedException {
        Thread.sleep(1000);
        return "Welcome to the book catalog!";
    }

}
