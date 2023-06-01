package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.factory;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.vehicle.Car;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.vehicle.Motorcycle;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.vehicle.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class VehicleFactory {
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        }
        throw new IllegalArgumentException("Invalid vehicle type: " + type);
    }
}
