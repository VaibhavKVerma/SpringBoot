package com.springboot.tut43to46;

import org.springframework.stereotype.Component;

@Component
public class ComponentClass {
    private String name;
    private int age;

    public ComponentClass() {
        System.out.println("BEAN LIFECYCLE 2: Construct the Bean Lifecycle");
    }

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
