package com.f90782.cars.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "vehicles")
public class Vehicle {
  @Id
  private int idVehicle;
  private String registrationPlate;
  private int manufacturingYear;
  private int idVehiclesmodels;
  private int idPeople;
}
