package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.factories.macos;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Button;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Checkbox;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.macos.MacOSButton;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.macos.MacOSCheckbox;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.factories.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
