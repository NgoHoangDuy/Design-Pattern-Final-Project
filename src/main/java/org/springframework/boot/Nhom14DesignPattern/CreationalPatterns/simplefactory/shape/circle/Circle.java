package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.shape.circle;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.shape.square.Shape;
import org.springframework.stereotype.Component;



import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Circle implements Shape {
    @Override
    public String draw() {
        return "Inside Circle::draw() method.";
    }
}
