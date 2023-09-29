package com.example.springlesson.configuration.lite_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.springlesson.configuration.lite_bean");

//        BeanA beanA = (BeanA) context.getBean("beanA");
        BeanC beanC = context.getBean("beanC", BeanC.class);
        System.out.println(beanC);
    }
}
