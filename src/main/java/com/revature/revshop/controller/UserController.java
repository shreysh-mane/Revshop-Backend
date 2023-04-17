package com.revature.revshop.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.revshop.entity.Role;
import com.revature.revshop.entity.User;
import com.revature.revshop.entity.UserRole;
import com.revature.revshop.service.UserServiceInterface;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserServiceInterface userServiceInterface;
	
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		Set<UserRole> roles = new HashSet<>();
		Role role = new Role();
		role.setRoleId(45L);
		role. setRoleName("NORMAL");

		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole. setRole(role);

		
		roles.add(userRole);
		
		
		return this.userServiceInterface.createUser(user, roles);
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userServiceInterface.getUser(username);
	}
	
	
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		this.userServiceInterface.deleteUser(userId);
	}

}
