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

import com.smartFarming.Service.pesticidesService;
import com.smartFarming.entities.Pesticides;
@RestController
@SpringBootApplication
public class PesticidesController {
	@Autowired
	pesticidesService ps;
	@PostMapping("/rs")
	Pesticides addPesticides(@RequestBody Pesticides pesticides)
	{
		return ps.addPesticides(pesticides);
	}
	@GetMapping("/viewAllPesticides")
	List<Pesticides> viewAllPesticides() {
		return ps.viewAllPesticides();
	}
	@GetMapping("/viewpesticidesById/{id}")
	 Pesticides viewpesticidesById(@PathVariable int id)
	 {
		return ps.viewpesticidesById(id);
	 }
	@PutMapping("/ updatepesticides/{id}")
	Pesticides updatepesticides( int id,@RequestBody Pesticides pesticides)
	{
		return ps.updatepesticides(id, pesticides);
	}
	@DeleteMapping("/deletepesticidesById/{id}")
	String  deletepesticidesById (@PathVariable int id) {
		return ps.deletepesticidesById(id);
	}
	@DeleteMapping("/deleteAllpesticides")
	 String deleteAllpesticides()
	 {
		return ps.deleteAllpesticides();
	 }
}
	
	