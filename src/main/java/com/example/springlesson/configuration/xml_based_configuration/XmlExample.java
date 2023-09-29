package com.example.springlesson.configuration.xml_based_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class XmlExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.example.springlesson.configuration.xml_based_configuration");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
