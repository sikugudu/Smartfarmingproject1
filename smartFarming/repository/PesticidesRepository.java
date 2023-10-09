package com.smartFarming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartFarming.entities.Pesticides;

public interface PesticidesRepository extends JpaRepository<Pesticides,Integer> { 

}
