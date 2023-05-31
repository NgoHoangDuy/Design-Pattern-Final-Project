package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.builders;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.cars.Type;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.components.Engine;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.components.GPSNavigator;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.components.Transmission;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.builder.components.TripComputer;

public interface Builder {
    void setType(Type type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
