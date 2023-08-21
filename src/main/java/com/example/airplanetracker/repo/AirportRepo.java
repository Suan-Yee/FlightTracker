package com.example.airplanetracker.repo;

import com.example.airplanetracker.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepo extends JpaRepository<Airport,Long> {

    Airport findByLocation(String location);
}
