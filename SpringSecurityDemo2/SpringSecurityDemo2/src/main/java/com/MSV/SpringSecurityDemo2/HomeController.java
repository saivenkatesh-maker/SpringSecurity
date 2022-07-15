package com.MSV.SpringSecurityDemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	
	@GetMapping("/admin")
	public String admin() {
		return "This is admin page";
	}
	
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		String message = userService.saveUser(user);
		return message;
		
	}

}
