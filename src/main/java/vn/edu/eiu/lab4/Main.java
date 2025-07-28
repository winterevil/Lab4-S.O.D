package vn.edu.eiu.lab4;

import vn.edu.eiu.lab4.entity.Payment;
import vn.edu.eiu.lab4.model.CardPayment;
import vn.edu.eiu.lab4.model.EwalletPayment;
import vn.edu.eiu.lab4.model.PaymentMethod;
import vn.edu.eiu.lab4.service.PaymentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new EwalletPayment();
        PaymentService paymentService = new PaymentService(paymentMethod);
        paymentService.processPayment(1, 200);

        PaymentMethod paymentMethod2 = new CardPayment();
        PaymentService paymentService2 = new PaymentService(paymentMethod2);
        paymentService2.processPayment(2, 150.5);
    }
}