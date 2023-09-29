package com.example.springlesson.configuration.annotation_based_configuration;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("com.example.springlesson.configuration.annotation_based_configuration");

//        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.springlesson.configuration.annotation_based_configuration");
//        context.scan("com.example.springlesson.configuration.annotation_based_configuration");
//        context.refresh();

        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
