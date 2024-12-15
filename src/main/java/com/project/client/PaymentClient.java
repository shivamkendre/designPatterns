package com.project.client;

import com.project.factory.PaymentFactory;
import com.project.strategy.Payment;
import com.project.strategy.PaymentMethod;

public class PaymentClient {
    public void payment() {
        Payment payment = PaymentMethod.DEBITCARD.getPayment();
        payment.pay();
    }
}
