package com.example.airplanetracker.service;

import com.example.airplanetracker.dto.FlightDto;
import com.example.airplanetracker.entity.Flight;

public interface FlightService {

    FlightDto addFlight (FlightDto flightDto);
    FlightDto findFlightNumber(String flightNumber);
}
