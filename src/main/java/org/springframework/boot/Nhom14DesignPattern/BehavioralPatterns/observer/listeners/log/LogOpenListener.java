package org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.observer.listeners.log;

import java.io.File;

import org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.observer.listeners.EventListener;



public class LogOpenListener implements EventListener {
    private File log;
    private String listenerName;

    public LogOpenListener(String fileName, String listenerName) {
        this.log = new File(fileName);
        this.listenerName = listenerName;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("listenerName: " + listenerName + " Save to log " + log + ": Someone has performed " + eventType + 
        		" operation with the following file: " + file.getName());
        
    }
}
