package com.smartFarming.ServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.smartFarming.Service.MaintenanceLogService;
import com.smartFarming.entities.MaintenanceLog;
import com.smartFarming.repository.MaintenanceLogRepository;


@Service
public class MaintenanceLogServiceImpl implements MaintenanceLogService {
	@Autowired
	MaintenanceLogRepository mr;

	@Override
	public MaintenanceLog addMaintenanceLog(MaintenanceLog MaintenanceLog) {
		
		return mr.save(MaintenanceLog);
	}

	@Override
	public List<MaintenanceLog> viewAllMaintenanceLog() {
		 List<MaintenanceLog> m= mr.findAll();
		return m;
	}

	@Override
	public MaintenanceLog viewMaintenanceLogById(int id) {
		MaintenanceLog m=mr.getById(id);
		return  (MaintenanceLog) m;
		
		
	}

	@Override
	public MaintenanceLog updateMaintenanceLog(int id, MaintenanceLog MaintenanceLog) {
		MaintenanceLog m=new MaintenanceLog();
		m.setLogID(MaintenanceLog.getLogID());
		m.setEquipmentID(MaintenanceLog.getEquipmentID());
		m.setDescription(MaintenanceLog.getDescription());
		m.setMaintenanceDate(MaintenanceLog.getMaintenanceDate());
		m.setCost(MaintenanceLog.getCost());
		return mr.save(MaintenanceLog);
	}

	@Override
	public String deleteMaintenanceLogById(int id) {
		mr.deleteById(id);
		return "MaintenanceLog is deleted";
	}

	@Override
	public String deleteAllMaintenanceLog() {
		mr.deleteAll();
		return "all MaintenanceLog are deleted";
	}
	

}



