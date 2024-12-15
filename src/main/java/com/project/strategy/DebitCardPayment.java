package com.project.strategy;

public class DebitCardPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Debit Card Payment is completed");
    }
}
