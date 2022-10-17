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
@Table(name = "people_specialities")
public class Peoplespecialities {
  @Id
  private int idPeoplespecialities;
  private int idPeople;
  private int idSpecialities;
}
