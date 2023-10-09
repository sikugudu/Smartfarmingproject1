package com.smartFarming.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MaintenanceLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int LogID;
	int EquipmentID;
	int MaintenanceDate;
	String Description;
	String cost;
	@ManyToOne
	@JoinColumn(name="Equipment_id")
	public Equipment equipment;
	public int getLogID() {
		return LogID;
	}
	public void setLogID(int logID) {
		LogID = logID;
	}
	public int getEquipmentID() {
		return EquipmentID;
	}
	public void setEquipmentID(int equipmentID) {
		EquipmentID = equipmentID;
	}
	public int getMaintenanceDate() {
		return MaintenanceDate;
	}
	public void setMaintenanceDate(int maintenanceDate) {
		MaintenanceDate = maintenanceDate;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "MaintenanceLog [LogID=" + LogID + ", EquipmentID=" + EquipmentID + ", MaintenanceDate="
				+ MaintenanceDate + ", Description=" + Description + ", cost=" + cost + "]";
	}
	

}



