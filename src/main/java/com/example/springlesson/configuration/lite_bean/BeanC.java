package com.example.springlesson.configuration.lite_bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanC {

    private BeanB beanB;

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    @Override
    public String toString() {
        return "BeanC{" +
                "beanB=" + beanB +
                '}';
    }
}
