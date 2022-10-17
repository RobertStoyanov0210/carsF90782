package com.f90782.cars.data.repository;

import com.f90782.cars.data.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
