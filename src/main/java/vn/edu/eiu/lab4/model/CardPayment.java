package vn.edu.eiu.lab4.model;

import vn.edu.eiu.lab4.entity.Payment;

public class CardPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing card payment: $" + amount);
    }
    @Override
    public String getMethodName() {
        return "Card Payment";
    }
}
