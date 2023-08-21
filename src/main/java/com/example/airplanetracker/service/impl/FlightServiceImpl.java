package com.example.airplanetracker.service.impl;

import com.example.airplanetracker.entity.Flight;
import com.example.airplanetracker.repo.FlightRepo;
import com.example.airplanetracker.service.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FlightServiceImpl implements FlightService {

    private FlightRepo flightRepo;

    @Override
    public Flight addFlight(Flight flight) {
        return flightRepo.save(flight) ;
    }

    @Override
    public Flight findFlightNumber(String flightNumber) {
        return flightRepo.findByFlightNumber(flightNumber);
    }
}
