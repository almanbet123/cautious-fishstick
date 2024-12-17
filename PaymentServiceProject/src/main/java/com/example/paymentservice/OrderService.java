package com.example.paymentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentService mainPaymentService;
    private final PaymentService additionalPaymentService;

    // Constructor Injection with Qualifier
    @Autowired
    public OrderService(
            @Qualifier("creditCardPaymentService") PaymentService mainPaymentService,
            @Qualifier("paypalPaymentService") PaymentService additionalPaymentService) {
        this.mainPaymentService = mainPaymentService;
        this.additionalPaymentService = additionalPaymentService;
    }

    public void placeOrder(double amount) {
        System.out.println("Placing order for amount: $" + amount);
        mainPaymentService.processPayment(amount);
        additionalPaymentService.processPayment(amount);
    }
}
