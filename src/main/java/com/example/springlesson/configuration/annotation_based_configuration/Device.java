package com.example.springlesson.configuration.annotation_based_configuration;

import org.springframework.stereotype.Component;

@Component("android")
public class Device {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Device{" +
                "model='" + model + '\'' +
                '}';
    }
}
