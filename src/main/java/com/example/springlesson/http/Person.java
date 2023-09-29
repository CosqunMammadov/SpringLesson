package com.example.springlesson.http;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Person {
    public Person() {

        System.out.println("Person");
    }

    private Long id;
    private String name;
    private String surname;
    private int age;
}
