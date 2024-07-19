package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Location;
import com.example.demo.services.LocationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/location")
public class LocationController {

    @Autowired
    private LocationServices locationServices;


    @GetMapping("/loc")
    public List<Location> getAllLocation() {
        return locationServices.findAll();
    }

    @PostMapping("/loc")
    public Location addLocation(
            @RequestBody Location location) {
        return locationServices.addLocation(location);
    }


    @GetMapping("loc/{loc_id}")
    public ResponseEntity<Location> getById
            (@PathVariable String id) {
        Location location = locationServices.findById(Long.valueOf(id)).orElseThrow(() -> new ResourceNotFoundException("Location not found with id: " + id));
        return ResponseEntity.ok(location);
    }

    @PutMapping("/loc/{loc_id}")
    public  void updatesLocation(
            @PathVariable Long loc_id,
            @RequestBody Location location){
        locationServices.updateLocation(loc_id,location);
    }

    @DeleteMapping("loc/{loc_id}")
    public  ResponseEntity<?>delete(
            @PathVariable Long loc_id){
        try {
            locationServices.deleteById(loc_id);
            return  new ResponseEntity<>("succesfuly delete", HttpStatus.ACCEPTED);
        }catch (Exception exception){
            return  new ResponseEntity<>("error",HttpStatus.NOT_FOUND);
        }
    }


}
