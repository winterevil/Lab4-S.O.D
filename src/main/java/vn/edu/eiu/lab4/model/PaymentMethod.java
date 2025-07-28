package vn.edu.eiu.lab4.model;

public interface PaymentMethod {
    void makePayment(double amount);
    String getMethodName();
}
