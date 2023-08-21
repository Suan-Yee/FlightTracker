package com.example.airplanetracker.response;

import com.example.airplanetracker.entity.Flight;
import com.example.airplanetracker.entity.Response;
import com.example.airplanetracker.service.FlightService;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("api/flight")
public class FlightController {

    private FlightService flightService;

    @PostMapping("save")
    public ResponseEntity<Response> saveFlight(@RequestBody Flight flight){
        return ResponseEntity.ok(
                Response.builder()
                        .timestamp(LocalDateTime.now())
                        .httpStatus(HttpStatus.CREATED)
                        .StatusCode(HttpStatus.CREATED.value())
                        .message("Saving new flight")
                        .data(Map.of("Saving",flightService.addFlight(flight)))
                        .build()
        );
    }

    @GetMapping("{flightNumber}")
    public ResponseEntity<Response> saveFlight(@PathVariable("flightNumber") String flightNumber){
        return ResponseEntity.ok(
                Response.builder()
                        .timestamp(LocalDateTime.now())
                        .httpStatus(HttpStatus.OK)
                        .StatusCode(HttpStatus.OK.value())
                        .message("flight Number")
                        .data(Map.of("Fetching",flightService.findFlightNumber(flightNumber)))
                        .build()
        );
    }

}
