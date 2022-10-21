package com.f90782.cars.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import com.f90782.cars.data.entity.Vehiclemodel;
import com.f90782.cars.data.repository.VehiclemodelRepository;
import com.f90782.cars.services.ModelService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelServiceImpl implements ModelService {

  private final VehiclemodelRepository VehiclemodelRepository;

  @Override
  public List<Vehiclemodel> getVehiclemodels() {
    return VehiclemodelRepository.findAll();
  }

  @Override
  public Vehiclemodel getVehiclemodel(long id) {
    return VehiclemodelRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid Vehiclemodel Id:" + id));
  }
}
