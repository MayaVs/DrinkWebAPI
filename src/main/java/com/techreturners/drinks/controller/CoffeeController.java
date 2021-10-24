package com.techreturners.drinks.controller;

import com.techreturners.drinks.model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CoffeeController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/coffeelover")
    public String home() {
        return "Welcome to the Drinks API!";
    }

    @GetMapping("/coffee")
    public Coffee coffee(@RequestParam(value = "name", defaultValue =  "latte") String name) {
        return new Coffee(counter.incrementAndGet(), name);  }
}

