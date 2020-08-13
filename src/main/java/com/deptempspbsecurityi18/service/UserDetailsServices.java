package com.deptempspbsecurityi18.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.deptempspbsecurityi18.dao.UserRepo;
import com.deptempspbsecurityi18.model.User;


@Service
public class UserDetailsServices implements UserDetailsService {

	
@Autowired
	UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("second" + username);
	Optional<User> user = userRepo.findByUserName(username);
	System.out.println("service  user detail");
	user.orElseThrow(()-> new UsernameNotFoundException("User not found"+username));
	System.out.println("user name "+user.get().getUserName()+"pass word "+user.get().getPassword());
		return user.map(UserDetailss::new).get();
	}

}
