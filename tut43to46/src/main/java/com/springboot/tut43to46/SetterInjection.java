package com.springboot.tut43to46;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjection {
    User user;

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }
}
