package vn.edu.eiu.lab4.service;

import vn.edu.eiu.lab4.entity.Payment;
import vn.edu.eiu.lab4.model.PaymentMethod;

public class PaymentService {
    private PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(int id, double amount) {
        paymentMethod.makePayment(amount);
        Payment payment = new Payment(id, amount, paymentMethod.getMethodName());
        System.out.println(payment.toString());
    }
}
