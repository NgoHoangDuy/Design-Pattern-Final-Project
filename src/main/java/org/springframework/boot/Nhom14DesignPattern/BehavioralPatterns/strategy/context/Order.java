package org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.strategy.context;

import org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.strategy.PayStrategy;

public class Order {

    public void processOrder(PayStrategy strategy) {
        strategy.pay();
        // Here we could collect and store payment data from the strategy.
    }
}