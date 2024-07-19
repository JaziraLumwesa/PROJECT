package com.example.demo.services;

import com.example.demo.Repository.LocationRepo;
import com.example.demo.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServices {

    private LocationRepo locationRepo;

    @Autowired
    public LocationServices(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }

    public List<Location> findAll() {
        return locationRepo.findAll();
    }

    public Location addLocation(Location location) {
        return locationRepo.save(location);
    }

    public Optional<Location> findById(Long id) {
        return locationRepo.findById(id);
    }

    public void deleteById(Long id) {
        locationRepo.deleteById(id);
    }

    public List<Location> getAll() {
        return findAll(); // Reuse findAll method instead of duplicating logic
    }

    public Location getLocationById(Long id) {
        return locationRepo.findById(id).orElse(null);
    }

    public void create(Location location) {
        locationRepo.save(location);
    }

    public void updateLocation(Long id, Location location) {
        Optional<Location> optionalExistingLocation = locationRepo.findById(id);
        optionalExistingLocation.ifPresent(existingLocation -> {
            existingLocation.setLongitude(location.getLongitude());
            existingLocation.setLatitude(location.getLatitude());
            existingLocation.setLocationName(location.getLocationName());

            existingLocation.setReservedSpace(location.getReservedSpace());
            locationRepo.save(existingLocation);
        });
    }

    public void delete(Long id) {
        locationRepo.deleteById(id);
    }
}
