package com.example.springlesson.designPattern.abstractFactory;

public class ShipFactory extends AbstractFactory{
    public Vehicle getVehicle(String vehicleType){
        if (vehicleType.equalsIgnoreCase("COSCO"))
            return new Cosco();
        return null;
    }
}
