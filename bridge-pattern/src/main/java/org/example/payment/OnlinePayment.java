package org.example.payment;

import org.example.paymentmethod.PaymentMethod;

public class OnlinePayment extends Payment {
    public OnlinePayment(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void pay(double money) {
        System.out.print("Payment online");
        paymentMethod.pay(money);
    }
}
