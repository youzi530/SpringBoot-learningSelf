package com.example.chapter14;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    DidiProperties didiProperties  = new DidiProperties();

    @GetMapping("/")
    public String index(){
        didiProperties.print();
        return "hello world";
    }
}
