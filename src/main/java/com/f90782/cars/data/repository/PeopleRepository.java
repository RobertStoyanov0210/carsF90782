package com.f90782.cars.data.repository;

import com.f90782.cars.data.entity.People;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
