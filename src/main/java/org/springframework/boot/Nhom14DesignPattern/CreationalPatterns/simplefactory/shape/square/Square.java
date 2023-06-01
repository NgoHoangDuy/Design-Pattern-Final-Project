package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.shape.square;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.shape.Shape;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Square implements Shape {
    @Override
    public String draw() {
        return "Inside Square::draw() method.";
    }
}