package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parkingspace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String spacestatus;

    // Many-to-one relationship with Location
//    @ManyToOne
//    @JoinColumn(name = "location_id", nullable = false)
//    private Location location;
}
