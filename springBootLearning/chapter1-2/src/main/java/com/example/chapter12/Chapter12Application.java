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

        //这是去读取配置文件yaml文件里面的 属性为name的值，然后注入给string name，下面就可以使用
        @Value("${name}")
        private String name;

        @RequestMapping("/")
        private String index(){
            return name;
        }
    }

}
