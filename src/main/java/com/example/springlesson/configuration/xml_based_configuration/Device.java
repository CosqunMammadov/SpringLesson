package com.example.springlesson.configuration.xml_based_configuration;

public class Device {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                '}';
    }
}
