package com.meettheright.service;

import com.meettheright.model.User_Login_Details;

public interface User_Login_DetailsService {
	void saveGmailUser_Login_Details(User_Login_Details user_Login_Details);

	void saveFbUser_Login_Details(User_Login_Details user_Login_Details);
}
