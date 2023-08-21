package com.example.airplanetracker.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AirportDto {

    private Long id;
    private String name;
    private String location;
}
