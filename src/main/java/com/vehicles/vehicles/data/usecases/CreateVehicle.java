package com.vehicles.vehicles.data.usecases;

import com.vehicles.vehicles.domain.entity.Vehicle;
import com.vehicles.vehicles.domain.usecases.ICreateVehicle;
import com.vehicles.vehicles.infra.VehicleRepository;
import com.vehicles.vehicles.presentational.dto.CreateVehicleDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateVehicle implements ICreateVehicle {

    private final VehicleRepository vehicleRepository;
    public Vehicle create(CreateVehicleDto data) throws Exception {
        var licensePlateAlreadyUsed =
                this.vehicleRepository.findByLicensePlate(data.getLicensePlate());
        if(licensePlateAlreadyUsed == null) throw new Exception("Placa já esta sendo usada");
        Vehicle vehicle = makeVehicle(data) ;
        this.vehicleRepository.save(vehicle);
        return vehicle;
    }

    private Vehicle makeVehicle(CreateVehicleDto data){
        return Vehicle.builder()
                .model(data.getModel())
                .brand(data.getBrand())
                .color(data.getColor())
                .power(data.getPower())
                .renavam(data.getRenavam())
                .licensePlate(data.getLicensePlate())
                .build();
    }
}
