package com.smartFarming.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartFarming.Service.FarmerService;
import com.smartFarming.entities.Farmer;



@RestController
@SpringBootApplication
public class FarmerController {
	@Autowired
	FarmerService fs;
	@PostMapping("/reg")
	Farmer addFarmers (@RequestBody Farmer farmer)
	{
		return fs.addfarmers(farmer);
	}
	
	@GetMapping("/viewAllFarmer")
	 List<Farmer> viewAllFarmer(){
		return  fs.viewAllFarmer();
	}
	@GetMapping("/viewfarmerById/{id}")
	Farmer viewfarmerById (@PathVariable int id) {
		return fs.viewfarmerById(id);
	}
	 @PutMapping("/updateFarmer/{id}")
	   Farmer updatefarmer(@PathVariable int id,@RequestBody Farmer farmer)
	    {
		 return fs.updatefarmer(id,farmer);
	    }
	 @DeleteMapping("/deleteFarmerById/{id}")

	    String deleteFarmerById(@PathVariable int id) {
	    	return fs.deletefarmerById(id);
	    }
	    
	    @DeleteMapping("/deleteAllFarmer")
	    String deleteAllFramer()
	    {
	    	return fs.deleteAllfarmer();
	    }
	    }
	    		

	

	
	






