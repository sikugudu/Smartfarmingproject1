package com.smartFarming.Service;
import java.util.List;

import com.smartFarming.entities.Farmer;





public interface FarmerService {
	Farmer addfarmers(Farmer farmer); 

	List<Farmer> viewAllFarmer();
	Farmer viewfarmerById(int id);
   

  Farmer updatefarmer( int id,Farmer farmer);

    String  deletefarmerById (int id) ;
    String deleteAllfarmer();


	

	

	

	
    




	
	
	}








