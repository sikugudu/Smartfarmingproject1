package com.smartFarming.Service;
import java.util.List;

import com.smartFarming.entities.Crop;





public interface CropService  {
	public  Crop addCrop(Crop crop); 

	 public  List<Crop> viewAllCrop();
	
   

   public Crop updatecrop( int id,Crop crop);

     public String  deletecropById (int id) ;
     public String deleteAllcrop();

	public Crop viewcropById(int id);

	 public Crop save(Crop crop);

	

	




	

	

	

	
    
   // void deleteUsersById(int id);



	
	
	}










