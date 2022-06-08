package com.pp.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gupp
 * @date 2022/6/9 00:16
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(com.pp.infrastructure.Application.class, args);
    }
}
