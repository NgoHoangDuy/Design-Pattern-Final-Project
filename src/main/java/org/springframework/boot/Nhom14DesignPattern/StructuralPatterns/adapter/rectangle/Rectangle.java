package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapter.rectangle;

public class Rectangle {
    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
    }
}
