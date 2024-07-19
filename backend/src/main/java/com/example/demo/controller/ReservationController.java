//package com.example.demo.controller;
//
//
//import com.example.demo.exception.ResourceNotFoundException;
//import com.example.demo.model.Reservation;
//import com.example.demo.services.ReservationServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@CrossOrigin
//@RestController
//@RequestMapping("/api/v1/reservation")
//public class ReservationController {
//
//    @Autowired
//    private ReservationServices reservationServices;
//
//
//    @GetMapping("/res")
//    public List<Reservation> getAllReservation() {
//        return reservationServices.findAll();
//    }
//
//    @PostMapping("/res")
//    public Reservation addReservation(
//            @RequestBody Reservation reservation) {
//        return reservationServices.addReservation(reservation);
//    }
//
//
//    @GetMapping("res/{res_id}")
//    public ResponseEntity<Reservation> getById
//            (@PathVariable String id) {
//        Reservation reservation = reservationServices.findById(Integer.valueOf(id)).orElseThrow(() -> new ResourceNotFoundException("Reservation not found with id: " + id));
//        return ResponseEntity.ok(reservation);
//    }
//
//    @PutMapping("/res/{res_id}")
//    public  void updatesReservation(
//            @PathVariable Integer res_id,
//            @RequestBody Reservation reservation){
//        reservationServices.updateReservation(res_id,reservation);
//    }
//
//    @DeleteMapping("res/{res_id}")
//    public  ResponseEntity<?>delete(
//            @PathVariable int res_id){
//        try {
//            reservationServices.deleteById(res_id);
//            return  new ResponseEntity<>("succesfuly delete", HttpStatus.ACCEPTED);
//        }catch (Exception exception){
//            return  new ResponseEntity<>("error", HttpStatus.NOT_FOUND);
//        }
//    }
//
//}
//
