package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapter.adapters.line;

import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapter.line.Line;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapters.Shape;

public class LineAdapter implements Shape {
    private Line adaptee;

    public LineAdapter(Line line) {
        this.adaptee = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}
