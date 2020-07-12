package com.meettheright.dao;

import org.springframework.stereotype.Service;

import com.meettheright.model.User_Login_Details;

@Service
public interface User_Login_DetailsDAO {

	void saveUser_Login_Details(User_Login_Details user_Login_Details);
	
}
