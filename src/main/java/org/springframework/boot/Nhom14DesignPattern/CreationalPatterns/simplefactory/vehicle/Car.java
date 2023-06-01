package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}