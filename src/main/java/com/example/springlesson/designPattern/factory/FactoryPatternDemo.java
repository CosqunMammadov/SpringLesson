package com.example.springlesson.designPattern.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car1 = factory.getCar("bmw");
        car1.create();

        Car car2 = factory.getCar("mercedes");
        car2.create();
    }
}
