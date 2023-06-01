package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod;

public class Book implements Product {
    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String getDescription() {
        return "This is a book.";
    }
}

