package com.example.airplanetracker.service;

import com.example.airplanetracker.entity.Flight;

public interface FlightService {

    Flight addFlight (Flight flight);
    Flight findFlightNumber(String flightNumber);
}
