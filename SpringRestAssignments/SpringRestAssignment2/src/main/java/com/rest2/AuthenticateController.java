package com.rest2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {
	
	
		
		@RequestMapping("/authenticate/{username}/{password}")
		public String getMessage(@PathVariable("username") String username, @PathVariable("password") String password) {
			String existingUser = "anil@mail.com";
			String piyuPass = "anil@123";
			
			if(username.equals(existingUser) && password.equals(piyuPass)) {
				return "Valid User";
			} else {
				return "Invalid User";
			}
		}
	}


