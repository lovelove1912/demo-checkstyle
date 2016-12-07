package dao;

import java.util.ArrayList;
import java.util.List;

import model.Payment;


public class PaymentDAO {
    public List<Payment> readPaymentList() {
        long currentTime = System.currentTimeMillis();
        List<Payment> paymentList = new ArrayList<>();
        if (currentTime % 2 != 0) {
            paymentList.add(new Payment());
        }
        else {
            paymentList.add(new Payment());
            paymentList.add(new Payment());
        }
        return paymentList;
    }
    
    
    public Payment findPayment(Long paymentId) {
        if (paymentId == null) {
            return null;
        }
        Payment payment = new Payment();
        
        return payment;
    }
}
