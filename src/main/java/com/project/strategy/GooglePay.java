package com.project.strategy;

public class GooglePay extends UPI{
    @Override
    public void payUsingUpiApp() {
        System.out.println("Payment done using google pay");
    }
}
