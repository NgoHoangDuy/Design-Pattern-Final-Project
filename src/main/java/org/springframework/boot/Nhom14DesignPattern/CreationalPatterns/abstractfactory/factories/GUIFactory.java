package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.factories;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Button;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
