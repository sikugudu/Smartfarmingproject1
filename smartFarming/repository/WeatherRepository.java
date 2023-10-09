package com.smartFarming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartFarming.entities.Weather;

public interface WeatherRepository extends JpaRepository<Weather,Integer> { 

}
