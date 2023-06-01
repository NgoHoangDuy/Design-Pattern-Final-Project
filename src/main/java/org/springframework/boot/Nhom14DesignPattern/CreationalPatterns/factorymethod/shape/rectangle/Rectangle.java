package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.rectangle;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.Shape;

@Slf4j
public class Rectangle implements Shape {

    private double area;
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void calculateArea() {
        area = length * breadth;
    }

    @Override
    public void sendArea() {
        log.debug("Area of a Rectangle: ", area);
    }
}
