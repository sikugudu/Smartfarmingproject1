package com.smartFarming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartFarming.entities.Crop;

public interface CropRepository extends JpaRepository<Crop,Integer>{

}
