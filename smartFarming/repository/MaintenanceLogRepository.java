package com.smartFarming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartFarming.entities.MaintenanceLog;





public interface MaintenanceLogRepository extends JpaRepository<MaintenanceLog,Integer>{

	//MaintenanceLog save(MaintenanceLog maintenanceLog); 
}


