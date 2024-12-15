package com.project.factory;

import com.project.strategy.*;

public class PaymentFactory {

    public static Payment getPayment(PaymentMethod paymentMethod){
       return switch (paymentMethod){
            case DEBITCARD ->  new DebitCardPayment();
            case NETBANKING -> new NetBankingPayment();
           case PHONEPAY -> new PhonePe();
           case GOOGLEPAY -> new GooglePay();
        };
    }
}
