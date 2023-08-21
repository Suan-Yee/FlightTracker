package com.example.airplanetracker.service.impl;

import com.example.airplanetracker.dto.FlightDto;
import com.example.airplanetracker.entity.Flight;
import com.example.airplanetracker.repo.FlightRepo;
import com.example.airplanetracker.service.FlightService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FlightServiceImpl implements FlightService {

    private FlightRepo flightRepo;
    private ModelMapper modelMapper;

    @Override
    public FlightDto addFlight(FlightDto flightDto) {
        Flight flight = modelMapper.map(flightDto,Flight.class);
        Flight savedFlight = flightRepo.save(flight);
        return modelMapper.map(savedFlight,FlightDto.class);
    }

    @Override
    public FlightDto findFlightNumber(String flightNumber) {

        Flight flight = flightRepo.findByFlightNumber(flightNumber);
        return modelMapper.map(flight,FlightDto.class);
    }
}
