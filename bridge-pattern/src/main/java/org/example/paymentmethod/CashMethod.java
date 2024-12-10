package org.example.paymentmethod;

public class CashMethod implements PaymentMethod {
    @Override
    public void pay(double money) {
        System.out.println(", pay by cash: " + money);
    }
}
