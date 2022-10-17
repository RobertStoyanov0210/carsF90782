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
@Table(name = "shops_vehiclesbrands")
public class Shopvehiclebrand {
  @Id
  private int idShopvehiclebrand;
  private int idShops;
  private int idVehiclesbrands;
}
