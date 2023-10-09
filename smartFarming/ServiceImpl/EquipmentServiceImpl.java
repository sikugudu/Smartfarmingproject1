package com.smartFarming.ServiceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartFarming.Service.EquipmentService;
import com.smartFarming.entities.Equipment;
import com.smartFarming.repository.EquipmentRepository;


@Service
public class EquipmentServiceImpl implements EquipmentService {
	@Autowired
	EquipmentRepository er;

	public Equipment addEquipment(Equipment equipment) {
		return er.save(equipment);
	}

	public List<Equipment> viewAllEquipment() {
		List<Equipment> e=er.findAll();
		return e;
	}

	public Equipment updateEquipment(int id, Equipment euipment) {
		Equipment e=new Equipment();
		e.setId(euipment.getId());
		e.setName(euipment.getName());
		e.setType(euipment.getType());
		e.setFarmerID(euipment.getFarmerID());
		return er.save(e);
	}

	public String deleteequipmentById(int id) {
		er.deleteById(id);
		return "Equipment is deleted" ;
	}

	public String deleteAllequipment() {
		er.deleteAll();
		return " all Equipment are deleted";
	}

	public Equipment viewequipmentById(int id) {
		Equipment e=er.findById(id).get();
		return e;
	}

}
