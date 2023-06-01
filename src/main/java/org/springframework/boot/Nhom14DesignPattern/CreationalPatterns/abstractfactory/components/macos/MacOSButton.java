package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.macos;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Button;

public class MacOSButton implements Button {
    @Override
    public String paint() {
        return "You have created MacOSButton.";
    }
}
