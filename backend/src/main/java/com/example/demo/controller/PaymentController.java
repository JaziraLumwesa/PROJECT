//package com.example.demo.controller;
//
//
//import com.example.demo.exception.ResourceNotFoundException;
//import com.example.demo.model.Payment;
//import com.example.demo.services.PaymentServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/api/v1/payment")
//public class PaymentController {
//
//    @Autowired
//    private PaymentServices paymentServices;
//
//
//    @GetMapping("/pa")
//    public List<Payment> getAllPayment() {
//        return paymentServices.findAll();
//    }
//
//    @PostMapping("/pa")
//    public Payment addPayment(
//            @RequestBody Payment payment) {
//        return paymentServices.addPayment(payment);
//    }
//
//
//    @GetMapping("pa/{pa_id}")
//    public ResponseEntity<Payment> getById
//            (@PathVariable String id) {
//        Payment payment = paymentServices.findById(Integer.valueOf(id)).orElseThrow(() -> new ResourceNotFoundException("Payment not found with id: " + id));
//        return ResponseEntity.ok(payment);
//    }
//
//    @PutMapping("/pa/{pa_id}")
//    public  void updatesCustomer(
//            @PathVariable Integer pa_id,
//            @RequestBody Payment payment){
//        paymentServices.updatePayment(pa_id,payment);
//    }
//
//    @DeleteMapping("pa/{pa_id}")
//    public  ResponseEntity<?>delete(
//            @PathVariable int pa_id){
//        try {
//            paymentServices.deleteById(pa_id);
//            return  new ResponseEntity<>("succesfuly delete", HttpStatus.ACCEPTED);
//        }catch (Exception exception){
//            return  new ResponseEntity<>("error",HttpStatus.NOT_FOUND);
//        }
//    }
//
//}
//
//
