package com.example.chapter15;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class Chapter15ApplicationTests {

    @Value("${datasource.password:}")
    private String password;

    @Test
    void contextLoads() {
        log.info("dataresource.password :{}",password);
    }

}
