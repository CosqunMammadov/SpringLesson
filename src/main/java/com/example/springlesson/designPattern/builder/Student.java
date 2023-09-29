package com.example.springlesson.designPattern.builder;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@ToString

public class Student {
    private String firstName;
    private String lastName;
    private int age;


//    public Student(String firstName, String lastName, int age){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
