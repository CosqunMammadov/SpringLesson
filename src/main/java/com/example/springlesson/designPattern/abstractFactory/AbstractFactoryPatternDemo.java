package com.example.springlesson.designPattern.abstractFactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory vehicleFactory = FactoryProducer.getFactory("ship");
        Vehicle vehicle1 = vehicleFactory.getVehicle("COSCO");
        Vehicle vehicle2 = vehicleFactory.getVehicle("BMW");
    }
}
