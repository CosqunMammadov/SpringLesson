package com.example.springlesson.designPattern.builder;

public class Main {
    public static void main(String[] args) {
        Student student = Student
                .builder()
                .firstName("Cosqun")
                .lastName("Mammadov")
                .age(23)
                .build();
        System.out.println(student);

        Student student1 = new Student();
    }
}
