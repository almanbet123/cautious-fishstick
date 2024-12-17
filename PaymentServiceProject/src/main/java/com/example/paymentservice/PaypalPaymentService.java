
package com.example.paymentservice;

import org.springframework.stereotype.Service;

@Service("paypalPaymentService")
public class PaypalPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
