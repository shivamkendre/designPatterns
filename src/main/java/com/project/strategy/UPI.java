package com.project.strategy;

public abstract class UPI implements Payment {

    @Override
    public void pay() {
        payUsingUpiApp();
    }


    public abstract void payUsingUpiApp();
}
