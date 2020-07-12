package com.meettheright.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meettheright.model.User_Login_Details;
import com.meettheright.service.User_Login_DetailsService;

@RestController
@RequestMapping("meettheright")
public class User_Login_DetailsController {

	@Autowired
	User_Login_DetailsService user_Login_DetailsService;

	@RequestMapping(value = "/saveUserLoginDetails", method = RequestMethod.POST)
	public void saveUser_Login_Details(@RequestBody User_Login_Details user_Login_Details) {
		try {
			user_Login_DetailsService.saveUser_Login_Details(user_Login_Details);
		} catch (Exception e) {
			e.toString();
		}
	}
}
