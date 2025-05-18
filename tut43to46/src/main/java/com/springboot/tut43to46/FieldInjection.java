package com.springboot.tut43to46;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjection {

    // Using Autowired
    @Autowired
    private User user;

//    @Autowired
//    private final User user2;
}


