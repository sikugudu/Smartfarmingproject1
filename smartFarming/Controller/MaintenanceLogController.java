package com.smartFarming.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.smartFarming.Service.MaintenanceLogService;
import com.smartFarming.entities.MaintenanceLog;



public class MaintenanceLogController {
	@Autowired
	MaintenanceLogService ms;
	@PostMapping("/rg")
	MaintenanceLog addMaintenanceLog (@RequestBody MaintenanceLog maintenanceLog)
	{
		return ms.addMaintenanceLog(maintenanceLog);
	}
	@GetMapping("/viewAllMaintenanceLog")
	List<MaintenanceLog> viewAllMaintenanceLog() {
		return ms.viewAllMaintenanceLog();
	}
	@GetMapping("/viewMaintenancelogById/{id}")
	MaintenanceLog viewMaintenancelogById (@PathVariable int id)
	{
		return ms.viewMaintenanceLogById(id);
	}
	@PutMapping("/updateMaintenanceLog/{id}")
	MaintenanceLog updateMaintenanceLog (@PathVariable int id, @RequestBody MaintenanceLog maintenanceLog)
	{
		return ms.updateMaintenanceLog(id, maintenanceLog);
	}
	@DeleteMapping("/deleteMaintennaceLogById/{id}")
	String deleteMaintennaceLogById(@PathVariable int id) {
		return ms.deleteMaintenanceLogById(id);
	}
	@DeleteMapping("/deleteAllMaintenanceLog")
	String deleteAllMaintenanceLog()
	{
		return ms.deleteAllMaintenanceLog();
	}
	

}



