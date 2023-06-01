package org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.observer.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
