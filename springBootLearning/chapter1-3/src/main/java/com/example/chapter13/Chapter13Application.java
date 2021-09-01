package com.example.chapter13;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
public class Chapter13Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter13Application.class, args);
    }


    @RestController
    @Slf4j
    static class HelloController{

        @Value("${db:}")
        private String db;

        @Value("${mq:}")
        private String mq;

        @RequestMapping("/")
        public String index() {
            log.info("db:" + db);
            log.info("mq:"+mq);
            return "";
        }
    }
}
