package org.example.payment;

import org.example.paymentmethod.PaymentMethod;

public class InStorePayment extends Payment {

    public InStorePayment(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void pay(double money) {
        System.out.print("Payment in store");
        paymentMethod.pay(money);
    }
}
