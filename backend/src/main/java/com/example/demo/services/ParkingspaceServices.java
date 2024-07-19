package com.example.demo.services;


import com.example.demo.Repository.ParkingspaceRepo;
import com.example.demo.model.Parkingspace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ParkingspaceServices{
    @Autowired
    private static ParkingspaceRepo parkingspaceRepo;

    public List<Parkingspace> findAll() {
        return parkingspaceRepo.findAll();
    }

    public static Parkingspace addParkingspace(Parkingspace parkingspace) {
        return parkingspaceRepo.save(parkingspace);
    }

    public Optional<Parkingspace> findById(Long id) {
        return parkingspaceRepo.findById(id);
    }



    public void deleteById(Long id) {
        parkingspaceRepo.deleteById(id);
    }

    public List<Parkingspace> getAll() {
        return parkingspaceRepo.findAll();
    }

    public Parkingspace getParkingspaceById(Long id) {
        return parkingspaceRepo.findById(id).orElse(null);
    }

    public void create(Parkingspace parkingspace) {
        parkingspaceRepo.save(parkingspace);
    }

//    public void

    public void updateParkingspace(Long id, Parkingspace parkingspace) {
        Parkingspace existingParkingspace = parkingspaceRepo.findById(id).orElse(null);
        if (existingParkingspace != null) {
            existingParkingspace.setSpacestatus(parkingspace.getSpacestatus());

            parkingspaceRepo.save(existingParkingspace);
        }
    }
    public void delete(Long id){parkingspaceRepo.deleteById(id);}
}

