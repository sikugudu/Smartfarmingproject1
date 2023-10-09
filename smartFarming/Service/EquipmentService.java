package com.smartFarming.Service;
import java.util.List;

import com.smartFarming.entities.Equipment;





public interface EquipmentService {
	public Equipment addEquipment(Equipment equipment); 

	 public  List<Equipment> viewAllEquipment();
	
 

 public Equipment updateEquipment( int id,Equipment euipment);

   public String  deleteequipmentById (int id) ;
   public String deleteAllequipment();

	public Equipment viewequipmentById(int id);


}



	


