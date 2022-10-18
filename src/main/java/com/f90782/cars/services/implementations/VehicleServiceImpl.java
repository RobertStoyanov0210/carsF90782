package com.f90782.cars.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.f90782.cars.data.entity.Vehicle;
import com.f90782.cars.data.repository.VehicleRepository;
import com.f90782.cars.services.VehicleService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VehicleServiceImpl implements VehicleService {

  private final VehicleRepository vehicleRepository;

  @Override
  public List<Vehicle> getVehicles() {
    return vehicleRepository.findAll();
  }

  @Override
  public Vehicle getVehicle(long id) {
    return vehicleRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid vehicle Id:" + id));
  }

  @Override
  public Vehicle create(Vehicle vehicle) {
    return vehicleRepository.save(vehicle);
  }

  @Override
  public Vehicle updateVehicle(long id, Vehicle vehicle) {
    vehicle.setIdVehicle(id);
    return vehicleRepository.save(vehicle);
  }

  @Override
  public void deleteVehicle(long id) {
    vehicleRepository.deleteById(id);
  }
}
