package com.meettheright.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.meettheright.dao.Requests_DetailsDAO;
import com.meettheright.model.Requests_Details;

@Repository
public class Requests_DetailsDAOImpl implements Requests_DetailsDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveRequestDetails(Requests_Details requests_Details) {

		StringBuilder insertSql = new StringBuilder(
				"Insert Into Requests_Details (userName,placesub2id, userNames, name, fromTime, toTime, duration");
		insertSql.append(",totalPeople,description,pictures,filledPeople)");

		insertSql.append(" values( ?,?,?,?,?,?,?,?,?,?,?)");
		try {
			this.jdbcTemplate.update(insertSql.toString(), requests_Details.getUserName(), requests_Details.getPlaceSub2Id(),
					requests_Details.getUserNames(), requests_Details.getName()
					, requests_Details.getFromTime(), requests_Details.getToTime()
					, requests_Details.getDuration()
					, requests_Details.getTotalPeople(), requests_Details.getDuration()
					, requests_Details.getPictures(), requests_Details.getFilledPeople());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
