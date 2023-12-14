package com.simpleSpringbootAPI.simpleSpringbootAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Hello {

    @GetMapping("/hello/{msg}")
    public String sayHello(@PathVariable String msg){
        return "Hello " + msg;
    }
}