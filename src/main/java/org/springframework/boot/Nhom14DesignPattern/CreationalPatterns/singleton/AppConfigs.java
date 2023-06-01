package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigs {
    //trả về một instance của lớp Singleton bằng cách gọi phương thức getInstance() của Singleton.
    // Điều này đảm bảo rằng chỉ có một phiên bản duy nhất của Singleton được tạo và quản lý bởi Spring container.
    @Bean
    public Singleton mySingleton() {
        return Singleton.getInstance();
    }
}

