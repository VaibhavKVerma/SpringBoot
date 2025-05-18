package com.springboot.tut43to46;

import org.springframework.stereotype.Component;

// This won't work. Throw error.

@Component
public class ComponentClass2 {
    private String name;
    private int age;

//    public ComponentClass2(String name,int age) {
//        this.age = age;
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
