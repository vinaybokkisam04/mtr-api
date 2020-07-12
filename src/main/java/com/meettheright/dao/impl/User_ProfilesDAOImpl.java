package com.meettheright.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.meettheright.dao.User_ProfilesDAO;
import com.meettheright.model.User_Profiles;

@Repository
public class User_ProfilesDAOImpl implements User_ProfilesDAO {
	
    private final Logger logger = Logger.getLogger(User_ProfilesDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveUserProfile(User_Profiles user_Profiles) {
		logger.info("Entering");
		
		StringBuilder insertSql = new StringBuilder(
				"Insert Into User_Profiles (userName, pictures, name, age, gender, location, description)");
		insertSql.append(" values(?,?,?,?,?,?,?)");
		try {
			jdbcTemplate.update(insertSql.toString(), user_Profiles.getUserName()
					, user_Profiles.getPictures()
					, user_Profiles.getName()
					, user_Profiles.getAge()
					, user_Profiles.getGender()
					, user_Profiles.getLocation()
					, user_Profiles.getDescription());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.info("Leaving");
	}

}
