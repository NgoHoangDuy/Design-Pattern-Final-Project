package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.factory.polygon;


import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.factory.Geometry;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.Shape;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.rectangle.Rectangle;

public class RectangleGeometry extends Geometry {

    private double length;
    private double breadth;

    public RectangleGeometry(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Shape createShape() {
        return new Rectangle(length, breadth);
    }
}
