package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Singleton mySingleton() {
        return Singleton.getInstance();
    }
}

