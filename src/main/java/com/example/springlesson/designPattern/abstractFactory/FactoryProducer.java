package com.example.springlesson.designPattern.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if (factoryType.equalsIgnoreCase("Ship"))
            return new ShipFactory();
        else if (factoryType.equalsIgnoreCase("Car"))
            return new CarFactory();
        else
            return null;
    }
}
