package com.deptempspbsecurityi18.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deptempspbsecurityi18.model.User;



public interface UserRepo extends JpaRepository<User, Integer> {

	
	Optional<User> findByUserName(String username); 
	
}
