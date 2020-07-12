package com.meettheright.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.meettheright.dao.User_Login_DetailsDAO;
import com.meettheright.model.User_Login_Details;

@Repository
public class User_Login_DetailsDAOImpl implements User_Login_DetailsDAO {
    private final Logger logger = Logger.getLogger(User_Login_DetailsDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveUser_Login_Details(User_Login_Details user_Login_Details) {
		logger.debug("Entering");
		
		StringBuilder insertSql = new StringBuilder(
				"Insert Into User_Login_Details (userName, phoneNumber, password, email)");
		insertSql.append(" values( ?,?,?,?)");
		try {
			this.jdbcTemplate.update(insertSql.toString()
					, user_Login_Details.getUserName()
					, user_Login_Details.getPhoneNumber()
					, user_Login_Details.getPassword()
					, user_Login_Details.getEmail());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.debug("Entering");
	}
}
