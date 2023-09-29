package com.example.springlesson.designPattern.builder;

public class StudentBuilder {
    private String firstName;
    private String lastName;
    private int age;

    public StudentBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder age(int age){
        this.age = age;
        return this;
    }

    public Student build(){
        return new Student(this.firstName, this.lastName, this.age);
    }
}
