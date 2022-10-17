package com.f90782.cars.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
  @GeneratedValue
  private long idVehicle;
  private String registrationPlate;
  private int manufacturingYear;
  @ManyToOne
  @JoinColumn(name = "id_vehiclesmodels")
  private Vehiclemodel idVehiclesmodels;
  @ManyToOne
  @JoinColumn(name = "id_people")
  private People idPeople;

}
