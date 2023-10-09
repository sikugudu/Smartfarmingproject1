package com.smartFarming.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.smartFarming.entities.Users;

public interface UserRepository extends JpaRepository<Users,Integer>{
	
}
