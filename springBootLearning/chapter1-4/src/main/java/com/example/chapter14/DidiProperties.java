package com.example.chapter14;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.didispace") //和上一个案例的value注解差不多
public class DidiProperties {

    private String from;

    public void print(){
        System.out.println(from);
    }
}
