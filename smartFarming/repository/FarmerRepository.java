package com.smartFarming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartFarming.entities.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer,Integer> {

}
