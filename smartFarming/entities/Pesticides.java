package com.smartFarming.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import net.bytebuddy.asm.Advice.Local;
@Entity
public class Pesticides {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int pesticideId;
	String pesticideName;
	int ApplicationDate;
	int CropId;
	@OneToMany(mappedBy="pesticides")
	List<Weather>weather;
	public int getPesticideId() {
		return pesticideId;
	}
	public void setPesticideId(int pesticideId) {
		this.pesticideId = pesticideId;
	}
	public String getPesticideName() {
		return pesticideName;
	}
	public void setPesticideName(String pesticideName) {
		this.pesticideName = pesticideName;
	}
	public int getApplicationDate() {
		return ApplicationDate;
	}
	public void setApplicationDate(int applicationDate) {
		ApplicationDate = applicationDate;
	}
	public int getCropId() {
		return CropId;
	}
	public void setCropId(int cropId) {
		CropId = cropId;
	}
	@Override
	public String toString() {
		return "Pesticides [pesticideId=" + pesticideId + ", pesticideName=" + pesticideName + ", ApplicationDate="
				+ ApplicationDate + ", CropId=" + CropId + "]";
	}
	
	}

	
	