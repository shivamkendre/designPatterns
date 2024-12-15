package com.project.strategy;

public enum PaymentMethod {
    NETBANKING(new NetBankingPayment()),
    DEBITCARD(new DebitCardPayment()),
    GOOGLEPAY(new GooglePay()),
    PHONEPAY(new PhonePe());


    public Payment payment;

    public Payment getPayment(){
        return this.payment;
    }

    private PaymentMethod(Payment payment){
        this.payment = payment;
    }
}
