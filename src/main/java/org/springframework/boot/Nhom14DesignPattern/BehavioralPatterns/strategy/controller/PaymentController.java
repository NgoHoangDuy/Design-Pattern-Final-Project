package org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.strategy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.strategy.strategies.PaymentStrategyManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentStrategyManager paymentStrategyManager;

    @Autowired
    public PaymentController(PaymentStrategyManager paymentStrategyManager) {
        this.paymentStrategyManager = paymentStrategyManager;
    }

    @GetMapping("/payment/{strategy}/{amount}")
    public String makePayment(@PathVariable String strategy, @PathVariable double amount) {
        paymentStrategyManager.processPayment(strategy, amount);
        return "Payment completed";
    }
}
