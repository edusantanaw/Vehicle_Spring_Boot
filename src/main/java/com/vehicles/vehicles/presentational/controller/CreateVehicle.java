package com.vehicles.vehicles.presentational.controller;

import com.vehicles.vehicles.domain.entity.Vehicle;
import com.vehicles.vehicles.domain.usecases.ICreateVehicle;
import com.vehicles.vehicles.presentational.dto.CreateVehicleDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/vehicle")
@RequiredArgsConstructor
public class CreateVehicle {

    private final ICreateVehicle createVehicle;

    @PostMapping()
    public ResponseEntity<Vehicle> create(@RequestBody @Valid CreateVehicleDto data) throws Exception {
        var vehicle = this.createVehicle.create(data);
        return new ResponseEntity<>(vehicle, HttpStatus.CREATED);
    }

}
