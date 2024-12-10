package org.example;

import org.example.payment.InStorePayment;
import org.example.payment.OnlinePayment;
import org.example.payment.Payment;
import org.example.paymentmethod.CashMethod;
import org.example.paymentmethod.PaymentMethod;
import org.example.paymentmethod.PaypalMethod;

public class DemoBridgePattern {

    public static void main(String[] args) {
        // Create payment method
        PaymentMethod paypalMethod = new PaypalMethod();
        PaymentMethod cashMethod = new CashMethod();

        // Create payment with method created
        Payment inStorePayment = new InStorePayment(cashMethod);
        Payment onlinePayment = new OnlinePayment(paypalMethod);

        // Create many payment and many payment method to maintain in future
        inStorePayment.pay(5); // Payment in store, pay by cash: 5.0
        onlinePayment.pay(5);  // Payment online, pay by paypal: 5.0
    }
}
