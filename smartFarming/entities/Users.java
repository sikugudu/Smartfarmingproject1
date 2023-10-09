
package com.smartFarming.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

int id;

String name;


String email;


String password;


@OneToMany(mappedBy="user")
List<Crop> crop;



@OneToOne(mappedBy="users", cascade = CascadeType.ALL)
public Farmer farmer;

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
}
}







