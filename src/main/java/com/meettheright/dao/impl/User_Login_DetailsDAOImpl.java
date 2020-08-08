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
	public void saveGmailUser_Login_Details(User_Login_Details user_Login_Details) {
		logger.debug("Entering");
		
		StringBuilder insertSql = new StringBuilder(
				"Insert Into User_Login_Details (GoogleUserMail,GoogleUserName,GoogleUserSurName,"
				+ "GoogleUserShortName,GoogleUserId,GoogleUserPhotoURL,phoneNumber, password)");
		insertSql.append(" values( ?,?,?,?,?,?,?,?)");
		try {
			this.jdbcTemplate.update(insertSql.toString()
					, user_Login_Details.getGoogleUserMail()
					, user_Login_Details.getGoogleUserName()
					, user_Login_Details.getGoogleUserSurName()
					, user_Login_Details.getGoogleUserShortName()
					, user_Login_Details.getGoogleUserId()
					, user_Login_Details.getGoogleUserPhotoURL()
					, user_Login_Details.getPhoneNumber()
					, user_Login_Details.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.debug("Entering");
	}

	@Override
	public boolean checkingGMailIdExist(String email) {
		logger.debug("Entering");
		
		StringBuilder insertSql = new StringBuilder("select count(*) from User_Login_Details");
		insertSql.append(" Where GoogleUserMail = ?");
		
		try {
			int count = this.jdbcTemplate.queryForObject(insertSql.toString(),new Object[]{email}, Integer.class);
			if(count > 0) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		return false;
	}

	@Override
	public void saveFbUser_Login_Details(User_Login_Details user_Login_Details) {
		logger.debug("Entering");
		
		StringBuilder insertSql = new StringBuilder(
				"Insert Into User_Login_Details (FbFirstName,FbLastName,FbId,FbName,FbPhotoURL)");
		insertSql.append(" values( ?,?,?,?,?)");
		try {
			this.jdbcTemplate.update(insertSql.toString()
					, user_Login_Details.getFbFirstName()
					, user_Login_Details.getFbLastName()
					, user_Login_Details.getFbId()
					, user_Login_Details.getFbName()
					, user_Login_Details.getFbPhotoURL());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		logger.debug("Entering");
	}
}
