//package com.example.demo.services;
//
//
//import com.example.demo.model.Payment;
//import com.example.demo.repo.PaymentRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PaymentServices {
//    @Autowired
//    private PaymentRepo paymentRepo;
//
//    public List<Payment> findAll() {
//        return paymentRepo.findAll();
//    }
//
//    public Payment addPayment(Payment payment) {
//        return paymentRepo.save(payment);
//    }
//
//    public Optional<Payment> findById(Integer id) {
//        return paymentRepo.findById(id);
//    }
//
//
//
//    public void deleteById(Integer id) {
//        paymentRepo.deleteById(id);
//    }
//
//    public List<Payment> getAll() {
//        return paymentRepo.findAll();
//    }
//
//    public Payment getPaymentById(int id) {
//        return paymentRepo.findById(id).orElse(null);
//    }
//
//    public void create(Payment payment) {
//        paymentRepo.save(payment);
//    }
//
////    public void
//
//    public void updatePayment(Integer id, Payment payment) {
//        Payment existingPayment = paymentRepo.findById(id).orElse(null);
//        if (existingPayment != null) {
//            existingPayment.setLocationN(payment.getLocationN());
//            existingPayment.setReserveN(payment.getReserveN());
//
//            paymentRepo.save(existingPayment);
//        }
//    }
//    public void delete(Integer id){paymentRepo.deleteById(id);}
//}
//
//
//
