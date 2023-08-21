package com.example.airplanetracker.service.impl;

import com.example.airplanetracker.dto.AirportDto;
import com.example.airplanetracker.entity.Airport;
import com.example.airplanetracker.repo.AirportRepo;
import com.example.airplanetracker.service.AirportService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AirportServiceImpl implements AirportService {

    private AirportRepo airportRepo;
    private ModelMapper modelMapper;

    @Override
    public AirportDto addAirport(AirportDto airportDto) {
        Airport savedAirport = modelMapper.map(airportDto,Airport.class);
        Airport airport = airportRepo.save(savedAirport);
        AirportDto savedAirportDto = modelMapper.map(airport,AirportDto.class);
        return  savedAirportDto;
    }

    @Override
    public AirportDto findAirportByLocation(String location) {

        Airport airport = airportRepo.findByLocation(location);
        return modelMapper.map(airport,AirportDto.class);
    }
}
