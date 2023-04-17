package com.revature.revshop;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.revshop.entity.Role;
import com.revature.revshop.entity.User;
import com.revature.revshop.entity.UserRole;
import com.revature.revshop.service.UserServiceInterface;

@SpringBootApplication
public class RevshopApplication implements CommandLineRunner {

	@Autowired
	private UserServiceInterface userServiceInterface;
	
	public static void main(String[] args) {
		SpringApplication.run(RevshopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("Starting code");
//		
//		User user =new User();
//		user.setFirstname("shreysh");
//		user.setLastname("mane");
//		user.setUsername("shreyshmane");
//		user.setPassword("pass");
//		user.setEmail("shreysh.mane1@gmail.com");
//		user.setProfile("pic.png");
//		
//		Role role=new Role();
//		role.setRoleId(44L);
//		role.setRoleName("ADMIN");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		
//		UserRole userRole= new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//		User userData=this.userServiceInterface.createUser(user, userRoleSet);
//		System.out.println(userData.getUsername());
		
		
		
		
		
	}

	
}
