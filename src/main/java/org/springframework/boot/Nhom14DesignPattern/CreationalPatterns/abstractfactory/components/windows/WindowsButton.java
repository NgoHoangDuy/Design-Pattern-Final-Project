package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.windows;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Button;

public class WindowsButton implements Button {
    @Override
    public String paint() {
        return "You have created WindowsButton.";
    }
}