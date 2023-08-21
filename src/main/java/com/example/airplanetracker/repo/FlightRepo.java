package com.example.airplanetracker.repo;

import com.example.airplanetracker.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flight,Long> {

    Flight findByFlightNumber(String flightNumber);
}
