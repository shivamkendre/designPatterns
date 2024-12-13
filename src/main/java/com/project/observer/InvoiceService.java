package com.project.observer;

public class InvoiceService implements Observer {

    @Override
    public void notifyMe() {
        invoiceLogic();
    }

    public void invoiceLogic(){
        System.out.println("Invoice Service is triggered");
    }
}
