package com.smartFarming.entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Equipment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String Type;
	int FarmerID;
	@OneToMany(mappedBy = "equipment")
    private List<MaintenanceLog> maintenanceLog;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getFarmerID() {
		return FarmerID;
	}
	public void setFarmerID(int farmerID) {
		FarmerID = farmerID;
	}
	@Override
	public String toString() {
		return "Equipment [id=" + id + ", name=" + name + ", Type=" + Type + ", FarmerID=" + FarmerID + "]";
	}
	

}




