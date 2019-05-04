package com.mfirmanakbar.loginpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfirmanakbar.loginpro.entity.UserEntity;
import com.mfirmanakbar.loginpro.service.UserService;


@RestController
@RequestMapping(value = "api/user/")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping(path="/{username}")
	public UserEntity findByUsername(@PathVariable String username) {
		System.out.println("\nTESTED-OK-TESTED-OK\n");
		return userService.findByUsername(username);
	}
	
	/*@GetMapping(path="/{username}")
	public String findByUsername(@PathVariable String username) {
		//UserEntity
		//return userService.findByUsername(username);
		System.out.println("TESTED-OK-TESTED-OK");
		return "TESTED-OK";
	}*/
	
}
