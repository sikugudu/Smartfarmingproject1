package com.smartFarming.Service;
import java.util.List;

import com.smartFarming.entities.MaintenanceLog;





public interface MaintenanceLogService {
	MaintenanceLog addMaintenanceLog(MaintenanceLog MaintenanceLog); 

	List<MaintenanceLog> viewAllMaintenanceLog();
	MaintenanceLog viewMaintenanceLogById(int id);
   

	MaintenanceLog updateMaintenanceLog( int id,MaintenanceLog MaintenanceLog);

    String  deleteMaintenanceLogById (int id) ;
    String deleteAllMaintenanceLog();

}



