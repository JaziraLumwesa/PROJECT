//package com.example.demo.services;
//
//
//import com.example.demo.model.Reservation;
//import com.example.demo.repo.ReservationRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ReservationServices {
//    @Autowired
//    private ReservationRepo reservationRepo;
//
//    public List<Reservation> findAll() {
//        return reservationRepo.findAll();
//    }
//
//    public Reservation addReservation(Reservation reservation) {
//        return reservationRepo.save(reservation);
//    }
//
//    public Optional<Reservation> findById(Integer id) {
//        return reservationRepo.findById(id);
//    }
//
//
//
//    public void deleteById(Integer id) {
//        reservationRepo.deleteById(id);
//    }
//
//    public List<Reservation> getAll() {
//        return reservationRepo.findAll();
//    }
//
//    public Reservation getReservationById(int id) {
//        return reservationRepo.findById(id).orElse(null);
//    }
//
//    public void create(Reservation reservation) {
//        reservationRepo.save(reservation);
//    }
//
////    public void
//
//    public void updateReservation(Integer id, Reservation reservation) {
//        Reservation existingReservation = reservationRepo.findById(id).orElse(null);
//        if (existingReservation != null) {
//            existingReservation.setSpaceId(reservation.getSpaceId());
//
//            reservationRepo.save(existingReservation);
//        }
//    }
//    public void delete(Integer id){reservationRepo.deleteById(id);}
//}
//
