package com.example.springlesson.configuration.annotation_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@ComponentScan
@Component
public class Student {

    @Autowired
    private Device device;

    @Autowired   // tək constructor varsa ehtiyac yoxdu (spring 4.3)
    public Student(Device device) {
        System.out.println("in constructor");
        device.setModel("android");
        this.device = device;
    }

    @Autowired
    @Qualifier("android")
    public void setDevice(Device device) {
        System.out.println("in set method");
        device.setModel("android");
        this.device = device;
    }

    @Override
    public String toString() {
        return "Student{" +
                "device=" + device +
                '}';
    }
}
