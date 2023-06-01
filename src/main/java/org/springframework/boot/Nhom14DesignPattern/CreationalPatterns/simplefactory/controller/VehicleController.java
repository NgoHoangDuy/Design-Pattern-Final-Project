package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.controller;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.vehicle.Vehicle;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.factory.VehicleFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    private final VehicleFactory vehicleFactory;

    public VehicleController(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createVehicle(@RequestParam("type") String type) {
        Vehicle vehicle = vehicleFactory.createVehicle(type);
        vehicle.start();
        // Do something with the vehicle

        return ResponseEntity.ok("Vehicle created");
    }
}
