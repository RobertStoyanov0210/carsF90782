package com.f90782.cars.data.repository;

import com.f90782.cars.data.entity.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
