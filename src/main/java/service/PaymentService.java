package service;

import java.util.List;

import model.Payment;

public interface PaymentService {
    /**
     * 
     * @param paymentCode String
     * @return abc
     */
    Payment readPayment(String paymentCode);
    Payment updatePayment(Payment Payment);
    void deletePayment(Payment Payment);
    List<Payment> searchPayment(String keyword);
}
