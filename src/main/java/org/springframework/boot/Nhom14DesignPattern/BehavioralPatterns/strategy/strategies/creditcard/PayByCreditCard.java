package org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.strategy.strategies.creditcard;

import org.springframework.boot.Nhom14DesignPattern.BehavioralPatterns.strategy.PayStrategy;

public class PayByCreditCard implements PayStrategy {

    private int paymentAmount;

    public PayByCreditCard(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public void pay() {
        verifyCreditCard();
        System.out.println("Paying " + paymentAmount + " using Credit Card.");
    }

    private void verifyCreditCard() {
        System.out.println("Credit Card verification has been successful.");
    }
}
