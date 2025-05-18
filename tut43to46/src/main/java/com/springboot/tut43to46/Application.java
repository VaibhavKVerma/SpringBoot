package com.springboot.tut43to46;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.tut43to46")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
