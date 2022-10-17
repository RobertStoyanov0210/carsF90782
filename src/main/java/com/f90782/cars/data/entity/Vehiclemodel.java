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
@Table(name = "vehiclesmodels")
public class Vehiclemodel {
  @Id
  @GeneratedValue
  private long idVehiclemodel;
  private String name;
  @ManyToOne
  @JoinColumn(name = "id_vehiclesbrand")
  private Vehiclebrand idVehiclesbrand;

}
