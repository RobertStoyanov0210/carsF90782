package com.f90782.cars.data.repository;

import com.f90782.cars.data.entity.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
