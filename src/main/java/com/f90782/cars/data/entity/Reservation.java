package com.f90782.cars.data.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "reservations")
public class Reservation {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long idReservation;
  @ManyToOne
  @JoinColumn(name = "id_shops")
  private Shop idShops;
  @ManyToOne
  @JoinColumn(name = "id_vehicle")
  private Vehicle idVehicle;
  @ManyToOne
  @JoinColumn(name = "id_specialities")
  private Specialities idSpecialities;
  private Date date;
}
