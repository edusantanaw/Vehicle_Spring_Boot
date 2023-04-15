package com.vehicles.vehicles.presentational.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateVehicleDto {
    @NotBlank()
    private String model;
    @NotBlank()
    private int power;
    @NotBlank()
    private String licensePlate;
    @NotBlank()
    private String brand;
    @NotBlank()
    private String renavam;
    @NotBlank()
    private String color;
}