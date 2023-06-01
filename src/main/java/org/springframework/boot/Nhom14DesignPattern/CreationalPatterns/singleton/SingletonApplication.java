package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SingletonApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SingletonApplication.class, args);

        SingletonUser singletonUser = context.getBean(SingletonUser.class);
        singletonUser.useSingleton();

        // Đoạn code dưới đây không tạo ra một instance mới của SingletonExample
        Singleton singleton = context.getBean(Singleton.class);
        singleton.showMessage();
    }

}
