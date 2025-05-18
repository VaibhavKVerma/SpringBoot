package com.springboot.tut43to46;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjection {
    Order order;

    @Autowired // this is not mandatory if one constructor is there after Spring 4.3
    public ConstructorInjection(Order order) {
        this.order = order;
    }
}
