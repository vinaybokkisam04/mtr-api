package com.meettheright.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meettheright.dao.Requests_DetailsDAO;
import com.meettheright.model.Requests_Details;
import com.meettheright.service.Requests_DetailsService;

@Repository
public class RequestDetailsServiceImpl implements Requests_DetailsService {

	@Autowired
	private Requests_DetailsDAO requestDetailsDAO;

	@Override
	public void saveRequests_Details(Requests_Details requests_Details) {
		requestDetailsDAO.saveRequestDetails(requests_Details);
	}

}
