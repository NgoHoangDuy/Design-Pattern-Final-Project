package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.vehicle;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.vehicle.Vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}