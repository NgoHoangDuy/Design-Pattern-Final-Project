package org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.observer.listeners.email;

import java.io.File;

import org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.observer.listeners.EventListener;



public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
