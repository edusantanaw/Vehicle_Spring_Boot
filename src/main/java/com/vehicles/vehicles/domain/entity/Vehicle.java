package com.vehicles.vehicles.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name="vehicle")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Column()
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private String model;
    @Column
    private int power;
    @Column(unique = true)
    private String licensePlate;
    @Column
    private String brand;
    @Column
    private String renavam;
    @Column
    private String color;

}