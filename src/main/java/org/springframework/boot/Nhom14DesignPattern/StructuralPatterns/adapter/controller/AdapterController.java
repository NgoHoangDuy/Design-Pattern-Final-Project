package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapter.adapters.Shape;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapter.adapters.line.LineAdapter;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapter.adapters.rectangle.RectangleAdapter;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapter.line.Line;
import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.adapter.rectangle.Rectangle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/adapter")
public class AdapterController {

    @GetMapping
    public ResponseEntity getAdapter() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RectangleAdapter(new Rectangle()));
        shapes.add(new LineAdapter(new Line()));

        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;

        shapes.forEach(shape -> shape.draw(x1, y1, x2, y2));

        return ResponseEntity.noContent().build();
    }
}
