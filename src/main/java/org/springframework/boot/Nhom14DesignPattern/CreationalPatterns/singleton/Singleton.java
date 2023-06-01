package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.singleton;

import org.springframework.stereotype.Component;

@Component
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // Khởi tạo singleton
        System.out.println("Tui tạo ra SingleTon rồi ne");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("xin chao");
    }
}