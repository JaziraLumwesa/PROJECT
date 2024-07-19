package com.example.demo.Repository;

import com.example.demo.model.Parkingspace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingspaceRepo extends JpaRepository<Parkingspace, Long> {
}
