package com.smartFarming.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;



@Entity
public class Crop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	int id;
	
	String name;
	
	String CropType;
	
	int plantingDate;
	
	int harvestDate;
	
	int farmerid;
	
@ManyToOne
@JoinColumn(name="User_id")
public Users user;





	
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
	public String getCropType() {
		return CropType;
	}
	public void setCropType(String cropType) {
		CropType = cropType;
	}
	public int getPlantingDate() {
		return plantingDate;
	}
	public void setPlantingDate(int plantingDate) {
		this.plantingDate = plantingDate;
	}
	public int getHarvestDate() {
		return harvestDate;
	}
	public void setHarvestDate(int harvestDate) {
		this.harvestDate = harvestDate;
	}
	public int getFarmerid() {
		return farmerid;
	}
	public void setFarmerid(int farmerid) {
		this.farmerid = farmerid;
	}
	@Override
	public String toString() {
		return "Crop [id=" + id + ", name=" + name + ", CropType=" + CropType + ", plantingDate=" + plantingDate
				+ ", harvestDate=" + harvestDate + ", farmerid=" + farmerid + "]";
	}
	
	
}


