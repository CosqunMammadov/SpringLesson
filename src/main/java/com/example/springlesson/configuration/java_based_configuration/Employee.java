package com.example.springlesson.configuration.java_based_configuration;

import org.springframework.context.annotation.Configuration;


public class Employee {

    private Device device;

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "device=" + device +
                '}';
    }
}
