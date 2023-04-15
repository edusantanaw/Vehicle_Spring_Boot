package com.vehicles.vehicles.presentational.controller;

import com.vehicles.vehicles.domain.entity.Vehicle;
import com.vehicles.vehicles.domain.usecases.ILoadById;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class LoadVehicleById {
    private  final ILoadById<Vehicle> loadVehicleById;
    @GetMapping(value = {"/id"})
    public ResponseEntity<Vehicle> loadById(@PathVariable UUID id){
        var vehicle = this.loadVehicleById.load(id);
        if(vehicle == null ) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(vehicle, HttpStatus.OK);
    }
}
