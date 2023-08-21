package com.example.airplanetracker.service;

import com.example.airplanetracker.entity.Airport;

public interface AirportService {

    Airport addAirport(Airport airport);

    Airport findAirportByLocation(String location);
}
