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

import com.smartFarming.Service.EquipmentService;
import com.smartFarming.entities.Equipment;


@RestController
@SpringBootApplication
public class EquipmentController {
	@Autowired
	EquipmentService es;
	@PostMapping("/res")
	Equipment addEquipment (@RequestBody Equipment equipment)
	{
		return es.addEquipment(equipment);
	}
	@GetMapping("/viewAllEquipment")
	List<Equipment> viewAllEquipment() {
		return es.viewAllEquipment();
	}
	@GetMapping("/viewEquipmentById/{id}")
	Equipment viewequipmentById (@PathVariable int id)
	{
		return es.viewequipmentById(id);
	}
	@PutMapping("/updateEquipment/{id}")
	Equipment updateequipment (@PathVariable int id, @RequestBody Equipment euipment)
	{
		return es.updateEquipment(id, euipment);
	}
	@DeleteMapping("/deleteEquipmentById/{id}")
	String deleteequipmentById(@PathVariable int id) {
	return es.deleteequipmentById(id);
}
	@DeleteMapping("/deleteAllEquipment")
	String deleteAllequipment()
	{
		return es.deleteAllequipment();
	}
}
	


