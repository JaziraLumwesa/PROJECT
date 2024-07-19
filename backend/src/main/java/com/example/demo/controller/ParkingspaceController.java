package com.example.demo.controller;


import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Parkingspace;
import com.example.demo.services.ParkingspaceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/parkingspace")
public class ParkingspaceController {

    @Autowired
    private ParkingspaceServices parkingspaceServices;


    @GetMapping("/par")
    public List<Parkingspace> getAllParkingspace() {
        return parkingspaceServices.findAll();
    }

    @PostMapping("/par")
    public Parkingspace addParkingspace(@RequestBody Parkingspace parkingspace) {
        return ParkingspaceServices.addParkingspace(parkingspace);
    }

    @GetMapping("par/{par_id}")
    public ResponseEntity<Parkingspace> getById
            (@PathVariable String id) {
        Parkingspace parkingspace = parkingspaceServices.findById(Long.valueOf(id)).orElseThrow(() -> new ResourceNotFoundException("Parkingspace not found with id: " + id));
        return ResponseEntity.ok(parkingspace);
    }

    @PutMapping("/par/{par_id}")
    public  void updatesParkingspace(
            @PathVariable Long par_id,
            @RequestBody Parkingspace parkingspace){
        parkingspaceServices.updateParkingspace(par_id,parkingspace);
    }

    @DeleteMapping("par/{par_id}")
    public  ResponseEntity<?>delete(
            @PathVariable long par_id){
        try {
            parkingspaceServices.deleteById(par_id);
            return  new ResponseEntity<>("succesfuly delete", HttpStatus.ACCEPTED);
        }catch (Exception exception){
            return  new ResponseEntity<>("error", HttpStatus.NOT_FOUND);
        }
    }

}

