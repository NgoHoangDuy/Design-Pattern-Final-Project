package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.factories.windows;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Button;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Checkbox;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.windows.WindowsButton;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.windows.WindowsCheckbox;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.factories.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}