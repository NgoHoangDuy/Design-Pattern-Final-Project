package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod;

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
