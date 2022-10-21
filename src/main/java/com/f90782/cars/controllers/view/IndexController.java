package com.f90782.cars.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class IndexController {
  @GetMapping
  public String getIndex(Model model) {
    final String welcomeMessage = "Welcome to website!";
    model.addAttribute("welcome", welcomeMessage);
    return "index";
  }
}
