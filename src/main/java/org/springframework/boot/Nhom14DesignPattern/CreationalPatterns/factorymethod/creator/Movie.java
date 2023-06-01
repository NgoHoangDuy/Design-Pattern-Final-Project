package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod.creator;

public class Movie implements Product {
    @Override
    public String getType() {
        return "Movie";
    }

    @Override
    public String getDescription() {
        return "This is a movie.";
    }
}