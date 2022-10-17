package com.f90782.cars.data.entity;

import java.sql.Date;

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
@Table(name = "reservations")
public class Reservation {
  @Id
  private int idReservation;
  private int idShops;
  private int idVehicle;
  private int idSpecialities;
  private Date date;
}
