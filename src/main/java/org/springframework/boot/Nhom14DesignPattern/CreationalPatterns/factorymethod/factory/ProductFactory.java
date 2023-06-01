package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.factory;

import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.creator.Book;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.creator.Movie;
import org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.creator.Product;

public class ProductFactory {
    public Product createProduct(String type) {
        if ("Book".equalsIgnoreCase(type)) {
            return new Book();
        } else if ("Movie".equalsIgnoreCase(type)) {
            return new Movie();
        }
        return null;
    }
}
