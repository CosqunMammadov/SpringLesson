package com.example.springlesson.designPattern.factory;

public class CarFactory {
    public Car getCar(String carType){
        if (carType.equalsIgnoreCase("BMW"))
            return new Bmw();
        else if (carType.equalsIgnoreCase("MERCEDES"))
            return new Mercedes();
        else
            return null;
    }
}
