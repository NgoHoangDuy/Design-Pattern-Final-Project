package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.controller;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.creator.Product;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.factory.ProductFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductFactory productFactory;

    public ProductController(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    @GetMapping("/products/{type}")
    public ResponseEntity<Product> getProduct(@PathVariable String type) {
        Product product = productFactory.createProduct(type);
        if (product != null) {
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.notFound().build();
    }
}
