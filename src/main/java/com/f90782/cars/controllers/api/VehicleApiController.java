package com.f90782.cars.controllers.api;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.f90782.cars.data.entity.Vehicle;
import com.f90782.cars.services.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
@AllArgsConstructor
public class VehicleApiController {

  private final VehicleService vehicleService;

  @GetMapping
  public List<Vehicle> getVehicles() {
    return vehicleService.getVehicles();
  }

  @RequestMapping("/{id}")
  public Vehicle getVehicle(@PathVariable("id") long id) {
    return vehicleService.getVehicle(id);
  }

  @PostMapping
  public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
    return vehicleService.create(vehicle);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/api/vehicles/{id}")
  public Vehicle updateVehicle(@PathVariable("id") long id, @RequestBody Vehicle vehicle) {
    return vehicleService.updateVehicle(id, vehicle);
  }

  @DeleteMapping(value = "/api/vehicles/{id}")
  public void deleteVehicle(@PathVariable long id) {
    vehicleService.deleteVehicle(id);
  }
}
