package com.smartFarming.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Weather {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int DataId;
	int Timestamp;
	String WheatherCondition;
	int Temperature;
	String precipitation;
	String windSpeed;
	int FarmerId;
	@ManyToOne
	@JoinColumn(name="p_id")
	public Pesticides pesticides;
	public int getDataId() {
		return DataId;
	}
	public void setDataId(int dataId) {
		DataId = dataId;
	}
	public int getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(int timestamp) {
		Timestamp = timestamp;
	}
	public String getWheatherCondition() {
		return WheatherCondition;
	}
	public void setWheatherCondition(String wheatherCondition) {
		WheatherCondition = wheatherCondition;
	}
	public int getTemperature() {
		return Temperature;
	}
	public void setTemperature(int temperature) {
		Temperature = temperature;
	}
	public String getPrecipitation() {
		return precipitation;
	}
	public void setPrecipitation(String precipitation) {
		this.precipitation = precipitation;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public int getFarmerId() {
		return FarmerId;
	}
	public void setFarmerId(int farmerId) {
		FarmerId = farmerId;
	}
	@Override
	public String toString() {
		return "Weather [DataId=" + DataId + ", Timestamp=" + Timestamp + ", WheatherCondition=" + WheatherCondition
				+ ", Temperature=" + Temperature + ", precipitation=" + precipitation + ", windSpeed=" + windSpeed
				+ ", FarmerId=" + FarmerId + "]";
	}
	
	
	

}
