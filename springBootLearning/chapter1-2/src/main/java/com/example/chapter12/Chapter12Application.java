package com.example.chapter12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Chapter12Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter12Application.class, args);
    }

    @RestController
    static class HelloController{

        @Value("${name:}")
        private String name;

        @RequestMapping("/")
        private String index(){
            return name;
        }
    }

}
