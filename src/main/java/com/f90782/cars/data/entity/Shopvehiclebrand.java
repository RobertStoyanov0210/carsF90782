package com.f90782.cars.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long idShopvehiclebrand;
  @OneToOne
  @JoinColumn(name = "id_shops")
  private Shop idShops;
  @OneToOne
  @JoinColumn(name = "id_vehiclesbrands")
  private Vehiclebrand idVehiclesbrands;
}
