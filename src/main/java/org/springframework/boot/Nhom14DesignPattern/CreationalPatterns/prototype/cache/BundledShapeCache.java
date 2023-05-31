package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.prototype.cache;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.prototype.shapes.Circle;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.prototype.shapes.Rectangle;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.setX(5);
        circle.setY(7);
        circle.setRadius(45);
        circle.setColor("Green");

        Rectangle rectangle = new Rectangle();
        rectangle.setX(6);
        rectangle.setY(9);
        rectangle.setWidth(8);
        rectangle.setHeight(10);
        rectangle.setColor("Blue");

        put("big.green.circle", circle);
        put("medium.blue.rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
