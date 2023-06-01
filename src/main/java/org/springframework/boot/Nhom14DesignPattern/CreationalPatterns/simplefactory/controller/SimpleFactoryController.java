package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.factory.ShapeFactory;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.simplefactory.shape.Shape;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;


@RestController
@RequestMapping("/simple_factory")
public class SimpleFactoryController {

    @Autowired
    ShapeFactory shapeFactory;

    @GetMapping("/{shape}")
    public ResponseEntity getShape(@PathVariable("shape") String shape) {

        Shape shape1 = shapeFactory.getShape(shape);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("result", shape1.draw());

        return new ResponseEntity(jsonObject.toString(), HttpStatus.OK);
    }
}
