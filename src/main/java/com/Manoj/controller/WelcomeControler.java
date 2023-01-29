package com.Manoj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Manoj.service.Welcomeservice;

@RestController
public class WelcomeControler {

	@Autowired
	private Welcomeservice welcomeservice;
	
	@GetMapping("/wel")
	public ResponseEntity<String> welcome(){
		
		String welcome = welcomeservice.welcome();
		
		return new ResponseEntity<String>(welcome,HttpStatus.OK);
	}
}
