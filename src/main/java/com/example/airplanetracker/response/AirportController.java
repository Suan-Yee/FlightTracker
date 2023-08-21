package com.example.airplanetracker.response;

import com.example.airplanetracker.dto.AirportDto;
import com.example.airplanetracker.entity.Airport;
import com.example.airplanetracker.entity.Response;
import com.example.airplanetracker.service.AirportService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("api/airport")
public class AirportController {

    private AirportService airportService;

    @PostMapping("save")
    public ResponseEntity<Response> saveAirport(@RequestBody AirportDto airportdto){
        return ResponseEntity.ok(
                Response.builder()
                        .timestamp(LocalDateTime.now())
                        .httpStatus(HttpStatus.CREATED)
                        .StatusCode(HttpStatus.CREATED.value())
                        .message("Saving new Airport")
                        .data(Map.of("Saving",airportService.addAirport(airportdto)))
                        .build()
        );
    }
    @GetMapping("{location}")
    public ResponseEntity<Response> findAirportLocation(@PathVariable("location") String location){
        return ResponseEntity.ok(
                Response.builder()
                        .timestamp(LocalDateTime.now())
                        .httpStatus(HttpStatus.OK)
                        .StatusCode(HttpStatus.OK.value())
                        .message("Fetching Airport")
                        .data(Map.of("Fetching",airportService.findAirportByLocation(location)))
                        .build()
        );
    }
}
