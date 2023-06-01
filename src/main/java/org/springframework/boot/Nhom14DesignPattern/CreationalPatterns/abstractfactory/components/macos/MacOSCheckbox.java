package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.macos;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "You have created MacOSCheckbox.";
    }
}
