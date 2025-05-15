package com.springboot.tut43to46;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean
    public BeanClass createBeanClassBean() {
        return new BeanClass("Vaibhav",25);
    }
}
