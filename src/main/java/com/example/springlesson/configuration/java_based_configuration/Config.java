package com.example.springlesson.configuration.java_based_configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class Config {

    @Bean("employee")
    public Employee getEmployee(@Qualifier("android1") Device device){
        Employee employee = new Employee();
        employee.setDevice(device);
        return employee;
    }

    @Bean("android1")
    public Device getDevice(){
        Device device = new Device();
        device.setName("android1");
        return device;
    }
}
