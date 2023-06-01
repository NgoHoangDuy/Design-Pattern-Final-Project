package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.shape.rectangle;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.shape.square.Shape;
import org.springframework.stereotype.Component;



import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Rectangle implements Shape {
    @Override
    public String draw() {
        return "Inside Rectangle::draw() method.";
    }
}
