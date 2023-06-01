package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.windows;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "You have created WindowsCheckbox.";
    }
}