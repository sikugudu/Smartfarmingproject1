package com.smartFarming.Service;

import java.util.List;

import com.smartFarming.entities.Users;



public interface UsersService  {
	public  Users addUsers(Users users); 

	 public  List<Users> viewAllCrop();
	
   

   public Users updateusers( int id,Users user);

     public String  deleteuserById (int id) ;
     public String deleteAlluser();

	public Users viewUsersById(int id);

	 public Users save(Users users);

	public List<Users> viewAllUsers();

	


}
