package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.singleton;

import org.springframework.stereotype.Component;

@Component
public class Singleton {
    private static Singleton instance;
    private String data;

    private Singleton() {
        // Khởi tạo các thành phần cần thiết
        data = "Initial data";
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}