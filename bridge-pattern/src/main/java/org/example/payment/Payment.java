package org.example.payment;

import org.example.paymentmethod.PaymentMethod;

public abstract class Payment {
    protected PaymentMethod paymentMethod;

    public Payment(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void pay(double money);

}
