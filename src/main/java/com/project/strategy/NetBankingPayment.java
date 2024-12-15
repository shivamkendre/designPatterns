package com.project.strategy;

public class NetBankingPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Net Banking Payment is prepared");
    }
}
