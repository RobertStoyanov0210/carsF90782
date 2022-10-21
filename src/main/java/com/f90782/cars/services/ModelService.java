package com.f90782.cars.services;

import java.util.List;

import com.f90782.cars.data.entity.Vehiclemodel;

public interface ModelService {
  List<Vehiclemodel> getVehiclemodels();

  Vehiclemodel getVehiclemodel(long id);
}
