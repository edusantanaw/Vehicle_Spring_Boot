package com.vehicles.vehicles.infra;

import com.vehicles.vehicles.domain.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {
    Vehicle findByLicensePlate(String licensePlate);
}
