package org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.strategy.strategies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class PaymentStrategyManager {
    private final Map<String, PaymentStrategy> paymentStrategies;

    @Autowired
    public PaymentStrategyManager(List<PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies.stream()
                .collect(Collectors.toMap(strategy -> strategy.getClass().getSimpleName(), strategy -> strategy));
    }

    public void processPayment(String strategyName, double amount) {
        PaymentStrategy paymentStrategy = paymentStrategies.get(strategyName);
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Invalid payment strategy: " + strategyName);
        }
        paymentStrategy.pay(amount);
    }
}
