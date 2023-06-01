package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.remotes.advanced;

import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.devices.Device;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.bridge.remotes.basic.BasicRemote;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}