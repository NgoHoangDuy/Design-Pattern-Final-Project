package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.decorator.datasource;


public interface DataSource {
    void writeData(String data);

    String readData();
}