package com.meettheright.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meettheright.model.User_Profiles;
import com.meettheright.service.User_ProfilesService;

@RestController
@RequestMapping("meettheright")
public class User_ProfilesController {

	@Autowired
	User_ProfilesService user_ProfilesService;

	@RequestMapping(value = "/saveUserProfile", method = RequestMethod.POST)
	public void saveUser_Profiles(@RequestBody User_Profiles user_Profiles) {
		try {
			user_ProfilesService.saveUserProfile(user_Profiles);
		} catch (Exception e) {
			e.toString();
		}
	}
}
