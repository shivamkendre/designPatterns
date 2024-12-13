package com.project;

import com.project.observer.DecoratorClient;
import com.project.observer.InvoiceService;
import com.project.observer.NotificationService;
import com.project.observer.PaymentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        NotificationService notificationService = new NotificationService();
//        InvoiceService invoiceService = new InvoiceService();
//        PaymentService paymentService = new PaymentService();
//
//
//        System.out.println("before subscribing");
//        notificationService.event();
//        System.out.println("after subscribing");
//        notificationService.subscribe(invoiceService);
//        notificationService.subscribe(paymentService);
//
//        notificationService.event();
//
//
//        notificationService.unsubscribe(invoiceService);
//        System.out.println("after unsubscribe");
//        notificationService.event();

        DecoratorClient client = new DecoratorClient();
        client.createDecorator();
    }
}


