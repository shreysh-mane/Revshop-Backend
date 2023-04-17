package com.revature.revshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.revshop.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
