package com.MSV.SpringSecurityDemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public String saveUser(User user) {
		User userVerifi = userRepo.findByUsername(user.getUsername());
		if(userVerifi!=null) {
			return "User with name alreday exists";
		}
		BCryptPasswordEncoder pass = new BCryptPasswordEncoder();
		String encodedpass=pass.encode(user.getPassword());
		user.setPassword(encodedpass);
		userRepo.save(user);
		return "Thank you for registering !";
	}
	
}
