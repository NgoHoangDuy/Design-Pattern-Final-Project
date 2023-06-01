package org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.decorator.decorators;

import org.springframework.boot.Nhom14DesignPattern.StructuralPatterns.decorator.datasource.DataSource;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
