package com.example.airplanetracker.service.impl;

import com.example.airplanetracker.entity.Airport;
import com.example.airplanetracker.repo.AirportRepo;
import com.example.airplanetracker.service.AirportService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AirportServiceImpl implements AirportService {

    private AirportRepo airportRepo;

    @Override
    public Airport addAirport(Airport airport) {
        return airportRepo.save(airport);
    }

    @Override
    public Airport findAirportByLocation(String location) {
        return airportRepo.findByLocation(location);
    }
}
