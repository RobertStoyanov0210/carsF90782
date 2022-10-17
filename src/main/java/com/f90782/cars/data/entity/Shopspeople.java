package com.f90782.cars.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "shops_people")
public class Shopspeople {
  @Id
  @GeneratedValue
  private long idShopspeople;
  @ManyToOne
  @JoinColumn(name = "id_shops")
  private Shop idShops;
  @OneToOne
  @JoinColumn(name = "id_people")
  private People idPeople;
}
