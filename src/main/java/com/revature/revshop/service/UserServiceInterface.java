package com.revature.revshop.service;

import java.util.Set;

import com.revature.revshop.entity.User;
import com.revature.revshop.entity.UserRole;

public interface UserServiceInterface {

	
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	public User getUser(String username);
	
	//delete user by id
	public void deleteUser(Long userId);
}
