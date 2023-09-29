package com.example.springlesson.designPattern.abstractFactory;

public class CarFactory extends AbstractFactory{
    @Override
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("BMW"))
            return new Bmw();
        return null;
    }
}
