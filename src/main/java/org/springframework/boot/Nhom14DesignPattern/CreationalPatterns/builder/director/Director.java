package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.director;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.builders.Builder;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.cars.Type;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.components.Engine;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.components.GPSNavigator;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.components.Transmission;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
