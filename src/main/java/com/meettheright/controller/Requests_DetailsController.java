package com.meettheright.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meettheright.model.Requests_Details;
import com.meettheright.service.Requests_DetailsService;

@RestController
@RequestMapping("meettheright")
public class Requests_DetailsController {

	@Autowired
	Requests_DetailsService requestDetailsService;

	@RequestMapping(value = "/saveRequestDetails", method = RequestMethod.POST)
	public void saveRequestDetails(@RequestBody Requests_Details requests_Details) {
		try {
			requestDetailsService.saveRequests_Details(requests_Details);
		} catch (Exception e) {
			e.toString();
		}
	}
}
