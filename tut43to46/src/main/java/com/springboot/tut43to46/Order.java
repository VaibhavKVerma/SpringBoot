package com.springboot.tut43to46;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Order {
    public Order() {
        System.out.println("BEAN LIFECYCLE 3: Lazy bean initialization, If Injected then Dependent Beans created");
    }
}
