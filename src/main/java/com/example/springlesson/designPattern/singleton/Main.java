package com.example.springlesson.designPattern.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonPattern singleton1 = SingletonPattern.getInstance();
        SingletonPattern singleton2 = SingletonPattern.getInstance();
    }
}
