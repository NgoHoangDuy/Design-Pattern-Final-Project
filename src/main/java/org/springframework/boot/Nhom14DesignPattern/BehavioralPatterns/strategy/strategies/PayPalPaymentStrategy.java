package org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.strategy.strategies;

import org.springframework.stereotype.Component;

@Component
public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        // Thực hiện thanh toán bằng PayPal
        System.out.println("Thanh toán bằng PayPal: " + amount);
    }
}
