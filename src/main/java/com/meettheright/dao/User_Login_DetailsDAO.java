package com.meettheright.dao;

import org.springframework.stereotype.Service;

import com.meettheright.model.User_Login_Details;

@Service
public interface User_Login_DetailsDAO {

	void saveGmailUser_Login_Details(User_Login_Details user_Login_Details);
	
	void saveFbUser_Login_Details(User_Login_Details user_Login_Details);
	
	boolean checkingGMailIdExist(String email);
	
}
