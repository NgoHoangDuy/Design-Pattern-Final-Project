package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.factory.circle;


import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.factory.Geometry;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.Shape;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.circle.Circle;

public class CircleGeometry extends Geometry {

    private double radius;

    public CircleGeometry(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape createShape() {
        return new Circle(radius);
    }
}
