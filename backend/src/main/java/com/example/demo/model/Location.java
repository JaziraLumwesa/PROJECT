package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Changed from Longitude to id for primary key
    private int longitude; // Changed to lowercase for consistency
    private int latitude; // Changed to lowercase for consistency
    private String locationName;
    private String reservedSpace;



    // One-to-many relationship with Parkingspace
//    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Parkingspace> parkingSpaces;


}
