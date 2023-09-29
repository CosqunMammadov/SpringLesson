package com.example.springlesson.configuration.java_based_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);     // No need to use @Configuration
        context.refresh();

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
