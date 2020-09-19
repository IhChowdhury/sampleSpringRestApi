package com.ibrahim.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibrahim.rest.model.User;
import com.ibrahim.rest.repository.UserRepository;

@RestController
public class SampleRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(path = "/insertNewUser")
	public String insertUser(@RequestParam(value = "name") String name, @RequestParam(value = "age") double age) {
		
		User user = new User(name,age);
		
		userRepository.saveAndFlush(user);
		
		String response = "";
		
		try {
			response = new ObjectMapper().writeValueAsString(user);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}
	
	@GetMapping(path = "/getUser", produces = {"application/json", "application/xml"})
	public User getUser(@RequestParam(value = "id") int id) {
		return userRepository.findById(id);
	}

}
