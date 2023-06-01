package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.Shape;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.circle.Circle;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.rectangle.Rectangle;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.square.Square;
import org.springframework.stereotype.Component;



@Component
public class ShapeFactory {

    @Autowired
    Circle circle;
    @Autowired
    Rectangle rectangle;
    @Autowired
    Square square;

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;

        switch (ShapeType.valueOf(shapeType)) {
            case CIRCLE:
                return circle;
            case RECTANGLE:
                return rectangle;
            case SQUARE:
                return square;
            default:
                return null;
        }
    }
}
