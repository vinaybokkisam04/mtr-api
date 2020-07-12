package com.meettheright.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meettheright.dao.User_ProfilesDAO;
import com.meettheright.model.User_Profiles;
import com.meettheright.service.User_ProfilesService;

@Repository
public class User_ProfilesServiceImpl implements User_ProfilesService {

	@Autowired
	private User_ProfilesDAO user_ProfilesDAO;

	@Override
	public void saveUserProfile(User_Profiles user_Profiles) {
		user_ProfilesDAO.saveUserProfile(user_Profiles);
	}

}
