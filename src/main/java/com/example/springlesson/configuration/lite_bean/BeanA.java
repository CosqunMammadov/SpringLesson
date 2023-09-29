package com.example.springlesson.configuration.lite_bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    private String name;
    private int age;
    private BeanB beanB;

    @Autowired
    public BeanA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    @Bean
    public BeanB beanB(){
        BeanB beanB = new BeanB();
        return beanB;
    }

    @Bean
    public static String name(){
        return "Cosqun";
    }

    @Bean
    public static int age(){
        return 23;
    }

    @Bean
    public String nameOfBeanB(){
        return "Bean B";
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", beanB=" + beanB +
                '}';
    }
}
