package com.MSV.SpringSecurityDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class SpringSecurityDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemo2Application.class, args);
	}

}
