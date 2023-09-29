package com.example.springlesson.configuration.lite_bean;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {
    private String nameOfBeanB;

    @Autowired
    public void setNameOfBeanB(String nameOfBeanB) {
        this.nameOfBeanB = nameOfBeanB;
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "nameOfBeanB='" + nameOfBeanB + '\'' +
                '}';
    }
}
