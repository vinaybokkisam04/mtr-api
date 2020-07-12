package com.meettheright.dao;

import org.springframework.stereotype.Service;

import com.meettheright.model.User_Profiles;

@Service
public interface User_ProfilesDAO {

	void saveUserProfile(User_Profiles user_Profiles);
	
}
