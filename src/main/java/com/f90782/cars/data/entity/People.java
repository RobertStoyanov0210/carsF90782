package com.f90782.cars.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "people")
public class People {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long idPeople;
  private String firstName;
  private String lastName;
  private boolean isMechanic;
}
