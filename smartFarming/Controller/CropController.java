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

import com.smartFarming.Service.CropService;
import com.smartFarming.entities.Crop;


@RestController
@SpringBootApplication
public class CropController {
	@Autowired
	CropService cs;
	@PostMapping("/regis")
	Crop addCrop (@RequestBody Crop crop)
	{
		return cs.addCrop(crop);
	}
	@GetMapping("/viewAllCrop")
	List<Crop> viewAllCrop() {
		return  cs.viewAllCrop();
	}
	@GetMapping("/viewCropById/{id}")
	Crop viewcropById (@PathVariable int id)
	{
		return cs.viewcropById(id);
	}
	@PutMapping("/updateCrop/{id}")
	Crop updatecrop (@PathVariable int id,@RequestBody Crop crop)
	{
		return cs.updatecrop(id, crop);
	}
	@DeleteMapping("/deleteCropById/{id}")
	String deleteCropById(@PathVariable int id) {
		return cs.deletecropById(id);
	}
	@DeleteMapping("/deleteAllcrop")
	String deleteAllCrop()
	{
		return cs.deleteAllcrop();
	}
	

}
