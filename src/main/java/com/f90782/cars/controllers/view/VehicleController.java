package com.f90782.cars.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.f90782.cars.data.entity.Vehicle;
import com.f90782.cars.data.entity.Vehiclemodel;
import com.f90782.cars.services.ModelService;
import com.f90782.cars.services.VehicleService;

import java.util.List;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/vehicles")
public class VehicleController {
  private VehicleService vehicleService;

  private ModelService modelService;

  @GetMapping
  public String getVehicles(Model model) {
    final List<Vehicle> vehicles = vehicleService.getVehicles();
    model.addAttribute("vehicles", vehicles);
    return "/vehicles/vehicles";
  }

  @GetMapping("/create-vehicle")
  public String showCreateVehicleForm(Model model) {
    final List<Vehiclemodel> models = modelService.getVehiclemodels();
    model.addAttribute("vehicle", new Vehicle());
    model.addAttribute("models", models);
    return "/vehicles/create-vehicle";
  }

  @PostMapping("/create")
  public String createVehicle(@ModelAttribute Vehicle vehicle) {
    vehicleService.create(vehicle);
    return "redirect:/vehicles";
  }

  @GetMapping("/edit-vehicle/{id}")
  public String showEditVehicleForm(Model model, @PathVariable long id) {
    model.addAttribute("vehicle", vehicleService.getVehicle(id));

    return "/vehicles/edit-vehicle";
  }

  @PostMapping("/update/{id}")
  public String updateVehicle(Model model, @PathVariable long id, Vehicle vehicle) {
    vehicleService.updateVehicle(id, vehicle);
    return "redirect:/vehicles";
  }

  @GetMapping("delete/{id}")
  public String deleteVehicle(@PathVariable long id) {
    vehicleService.deleteVehicle(id);
    return "redirect:/vehicles";
  }

}
