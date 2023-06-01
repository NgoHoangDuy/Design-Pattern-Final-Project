package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.service;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Button;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.components.Checkbox;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.abstractfactory.factories.GUIFactory;

import com.google.gson.JsonObject;

public class FactoryService {

    private Button button;
    private Checkbox checkbox;

    public FactoryService(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public String businessLogic() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("button", button.paint());
        jsonObject.addProperty("checkbox", checkbox.paint());

        return jsonObject.toString();
    }
}
