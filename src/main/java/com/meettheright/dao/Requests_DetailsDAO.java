package com.meettheright.dao;

import org.springframework.stereotype.Service;

import com.meettheright.model.Requests_Details;

@Service
public interface Requests_DetailsDAO {

	void saveRequestDetails(Requests_Details requests_Details);
	
}
