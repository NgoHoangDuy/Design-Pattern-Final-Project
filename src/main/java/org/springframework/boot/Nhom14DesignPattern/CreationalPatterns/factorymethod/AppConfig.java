package org.springframework.boot.Nhom14DesignPattern.CreationalPatterns.factorymethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ProductFactory productFactory() {
        return new ProductFactory();
    }

    @Bean
    public ProductController productController(ProductFactory productFactory) {
        return new ProductController(productFactory);
    }
}


