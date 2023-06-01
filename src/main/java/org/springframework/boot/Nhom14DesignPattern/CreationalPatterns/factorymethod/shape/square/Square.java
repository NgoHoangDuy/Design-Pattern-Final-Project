package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.square;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.shape.Shape;

@Slf4j
public class Square implements Shape {

    private double area;
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void calculateArea() {
        area = length * length;
    }

    @Override
    public void sendArea() {
        log.debug("Area of a square: ", area);
    }

}
