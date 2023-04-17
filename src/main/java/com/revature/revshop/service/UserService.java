package com.revature.revshop.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.revshop.entity.User;
import com.revature.revshop.entity.UserRole;
import com.revature.revshop.repository.RoleRepository;
import com.revature.revshop.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception{
		// TODO Auto-generated method stub
		
		User userdata = this.userRepository.findByUsername(user.getUsername());
		if(userdata!=null) {
			throw new Exception("User already present");
		}
		else {
			for(UserRole userrole:userRoles) {
				roleRepository.save(userrole.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			userdata=this.userRepository.save(user);
		}
		return userdata;
	}


	// get user by username
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findByUsername(username);
	}


	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
	}

}
