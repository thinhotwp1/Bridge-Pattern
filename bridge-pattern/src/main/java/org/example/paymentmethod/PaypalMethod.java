package org.example.paymentmethod;

public class PaypalMethod implements PaymentMethod {
    @Override
    public void pay(double money) {
        System.out.println(", pay by paypal: " + money);
    }
}
