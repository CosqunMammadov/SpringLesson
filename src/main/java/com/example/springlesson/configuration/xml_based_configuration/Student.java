package com.example.springlesson.configuration.xml_based_configuration;

import lombok.Getter;

import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String surName;
    private int age;
    private int number;
    private Device device;

    List<String> schedule;
    Map<String, Device> devices;

    public Student() {
    }

    public Student(Device device) {
        this.device = device;
    }

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public Student(int age, int number) {
        this.age = age;
        this.number = number;
    }

    public Student(String name, String surName, int age, int number) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.number = number;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setNumber(int number) {
        this.number = number;
    }


    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }


    public void setDevices(Map<String, Device> devices) {
        this.devices = devices;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", device=" + device +
                ", schedule=" + schedule +
                ", devices=" + devices +
                '}';
    }
}
