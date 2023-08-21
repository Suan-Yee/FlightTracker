package com.example.airplanetracker.service;

import com.example.airplanetracker.dto.AirportDto;
import com.example.airplanetracker.entity.Airport;

public interface AirportService {

    AirportDto addAirport(AirportDto airportDto);

    AirportDto findAirportByLocation(String location);
}
