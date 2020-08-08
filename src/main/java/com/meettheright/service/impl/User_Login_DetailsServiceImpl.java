package com.meettheright.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meettheright.dao.User_Login_DetailsDAO;
import com.meettheright.model.User_Login_Details;
import com.meettheright.service.User_Login_DetailsService;

@Repository
public class User_Login_DetailsServiceImpl implements User_Login_DetailsService {

	@Autowired
	private User_Login_DetailsDAO user_Login_DetailsDAO;

	@Override
	public void saveGmailUser_Login_Details(User_Login_Details user_Login_Details) {
		if (!checkingMailIdExist(user_Login_Details.getGoogleUserMail())) {
			user_Login_DetailsDAO.saveGmailUser_Login_Details(user_Login_Details);
		}
	}

	private boolean checkingMailIdExist(String email) {
		return user_Login_DetailsDAO.checkingGMailIdExist(email);
	}

	@Override
	public void saveFbUser_Login_Details(User_Login_Details user_Login_Details) {
		user_Login_DetailsDAO.saveFbUser_Login_Details(user_Login_Details);
	}

}
