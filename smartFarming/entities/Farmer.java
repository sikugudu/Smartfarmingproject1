package com.smartFarming.entities;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;





@Entity
public class Farmer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	int farmerid;
	String name;
	String contractInformation;
	String address;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="U_id")
	public Users users;
		
	
	public int getFarmerid() {
		return farmerid;
	}
	public void setFarmerid(int farmerid) {
		this.farmerid = farmerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContractInformation() {
		return contractInformation;
	}
	public void setContractInformation(String contractInformation) {
		this.contractInformation = contractInformation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Farmer [farmerid=" + farmerid + ", name=" + name + ", contractInformation=" + contractInformation
				+ ", address=" + address + ", getFarmerid()=" + getFarmerid() + ", getName()=" + getName()
				+ ", getContractInformation()=" + getContractInformation() + ", getAddress()=" + getAddress()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setId(Object id) {
		// TODO Auto-generated method stub
		
	}
	

}







