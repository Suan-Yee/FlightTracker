package com.example.airplanetracker.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

@SuperBuilder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    protected LocalDateTime timestamp;
    protected int StatusCode;
    protected HttpStatus httpStatus;
    protected String message;
    protected Map<?,?> data;
}
