package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.controller;

import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.devices.Device;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.devices.radio.Radio;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.devices.tv.Tv;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.remotes.Remote;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.remotes.advanced.AdvancedRemote;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.remotes.basic.BasicRemote;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bridge")
public class BridgeController {

    @GetMapping
    public ResponseEntity getBridge() {

        testDevice(new Tv());
        testDevice(new Radio());

        return ResponseEntity.noContent().build();
    }

    private void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        Remote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
