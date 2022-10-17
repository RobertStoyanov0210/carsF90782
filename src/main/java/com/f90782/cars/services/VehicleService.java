package com.f90782.cars.services;

import java.util.List;

import com.f90782.cars.data.entity.Vehicle;

public interface VehicleService {
  List<Vehicle> getVehicles();

  Vehicle getVehicle(long id);

  Vehicle create(Vehicle vehicle);

  Vehicle updateVehicle(long id, Vehicle vehicle);

  void deleteVehicle(long id);
}
