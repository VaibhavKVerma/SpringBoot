package com.springboot.tut43to46;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    private Order order;

    public User() {
        System.out.println("BEAN LIFECYCLE 2: User Bean initialization");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("BEAN LIFECYCLE 4: POST Construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("BEAN LIFECYCLE 6: PRE Destroy");
    }
}
