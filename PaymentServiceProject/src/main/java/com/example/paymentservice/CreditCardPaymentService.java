
package com.example.paymentservice;

import org.springframework.stereotype.Service;

@Service("creditCardPaymentService")
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
