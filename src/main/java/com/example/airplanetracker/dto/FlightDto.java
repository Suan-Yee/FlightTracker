package com.example.airplanetracker.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FlightDto {

    private Long id;
    private String flightNumber;
    private String departureTime;
    private String arrivalTime;

}
