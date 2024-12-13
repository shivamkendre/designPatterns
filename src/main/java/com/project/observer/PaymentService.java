package com.project.observer;

public class PaymentService implements Observer {
    @Override
    public void notifyMe() {
        paymentLogic();
    }

    public void paymentLogic(){
        System.out.println("payment logic");
    }
}
