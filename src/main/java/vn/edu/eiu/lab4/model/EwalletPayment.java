package vn.edu.eiu.lab4.model;

public class EwalletPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Processing eWallet payment: $" + amount);
    }

    @Override
    public String getMethodName() {
        return "eWallet Payment";
    }
}
