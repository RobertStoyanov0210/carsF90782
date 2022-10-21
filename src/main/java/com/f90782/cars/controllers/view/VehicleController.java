package com.f90782.cars.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.f90782.cars.data.entity.Vehicle;
import com.f90782.cars.services.VehicleService;

import java.util.List;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/vehicles")
public class VehicleController {
  private VehicleService vehicleService;

  @GetMapping
  public String getVehicles(Model model) {
    final List<Vehicle> vehicles = vehicleService.getVehicles();
    model.addAttribute("vehicles", vehicles);
    return "/vehicles/vehicles.html";
  }
}
