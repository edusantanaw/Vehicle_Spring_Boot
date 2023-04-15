package com.vehicles.vehicles.domain.usecases;

import com.vehicles.vehicles.domain.entity.Vehicle;
import com.vehicles.vehicles.presentational.dto.CreateVehicleDto;

public interface ICreateVehicle {
    Vehicle create(CreateVehicleDto data) throws Exception;
}
