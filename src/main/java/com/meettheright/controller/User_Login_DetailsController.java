package com.meettheright.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meettheright.model.User_Login_Details;
import com.meettheright.service.User_Login_DetailsService;
import com.restfb.json.JsonObject;

@RestController
@RequestMapping("meettheright")
public class User_Login_DetailsController {
    private static final Logger LOGGER = LogManager.getLogger(User_Login_DetailsController.class);
    
    @Autowired
	User_Login_DetailsService user_Login_DetailsService;

    @RequestMapping(value = "/saveUserLoginDetailsFromReactNative", method = RequestMethod.POST)
	public void saveUser_Login_Details(@RequestBody String responseJSON) {
		LOGGER.debug("Entering");
		
		try {
			JsonObject mainJsonObject = new JsonObject(responseJSON);
			User_Login_Details user_Login_Details = new User_Login_Details();
			JsonObject userJson = mainJsonObject.getJsonObject("user");
			user_Login_Details.setGoogleUserMail((String) userJson.get("email"));
			user_Login_Details.setGoogleUserId((String) userJson.get("id"));
			user_Login_Details.setGoogleUserShortName((String) userJson.get("givenName"));
			user_Login_Details.setGoogleUserSurName((String) userJson.get("familyName"));
			user_Login_Details.setGoogleUserPhotoURL((String) userJson.get("photo"));
			user_Login_Details.setGoogleUserName((String) userJson.get("name"));
			this.user_Login_DetailsService.saveGmailUser_Login_Details(user_Login_Details);
		} catch (Exception e) {
			LOGGER.debug(e.toString());
		}
		
		LOGGER.debug("Entering");
	}
    
	@RequestMapping(value = "/saveGmailUserLoginDetailsFromWeb", method = RequestMethod.POST)
	public void saveGmailUser_Login_Details(@RequestBody String responseJSON) {
		LOGGER.debug("Entering");
		
		try {
			User_Login_Details user_Login_Details = new User_Login_Details();
			JsonObject userJson = new JsonObject(responseJSON);
			user_Login_Details.setGoogleUserMail((String) userJson.get("email"));
			user_Login_Details.setGoogleUserId((String) userJson.get("id"));
			user_Login_Details.setGoogleUserShortName((String) userJson.get("givenName"));
			user_Login_Details.setGoogleUserSurName((String) userJson.get("familyName"));
			user_Login_Details.setGoogleUserPhotoURL((String) userJson.get("photo"));
			user_Login_Details.setGoogleUserName((String) userJson.get("name"));
			this.user_Login_DetailsService.saveGmailUser_Login_Details(user_Login_Details);
		} catch (Exception e) {
			LOGGER.debug(e.toString());
		}
		
		LOGGER.debug("Entering");
	}
	
	@RequestMapping(value = "/saveFacebookUserLoginDetailsFromWeb", method = RequestMethod.POST)
	public void saveFacebookUser_Login_Details(@RequestBody String responseJSON) {
		LOGGER.debug("Entering");
		
		try {
			User_Login_Details user_Login_Details = new User_Login_Details();
			JsonObject userJson = new JsonObject(responseJSON);
			user_Login_Details.setFbFirstName((String) userJson.get("first_name"));
			user_Login_Details.setFbLastName((String) userJson.get("last_name"));
			user_Login_Details.setFbName((String) userJson.get("name"));
			JsonObject pictureJson = (userJson.getJsonObject("picture"));
			JsonObject pictureDataJson = (pictureJson.getJsonObject("data"));
			user_Login_Details.setFbPhotoURL((String) (pictureDataJson.get("url")));
			user_Login_Details.setFbId((String) userJson.get("id"));
			this.user_Login_DetailsService.saveFbUser_Login_Details(user_Login_Details);
		} catch (Exception e) {
			LOGGER.debug(e.toString());
		}
		
		LOGGER.debug("Entering");
	}
	
}
