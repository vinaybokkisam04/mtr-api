package com.meettheright.model;

import java.security.Timestamp;

public class Requests_Details {

	private int requestId;
	private int placeSub2Id;
	private String userName;
	private String[] userNames;
	private String name;
	private Timestamp fromTime;
	private Timestamp toTime;
	private int duration;
	private int totalPeople;
	private int filledPeople;
	private String description;
	private byte[] pictures;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getPlaceSub2Id() {
		return placeSub2Id;
	}

	public void setPlaceSub2Id(int placeSub2Id) {
		this.placeSub2Id = placeSub2Id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String[] getUserNames() {
		return userNames;
	}

	public void setUserNames(String[] userNames) {
		this.userNames = userNames;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getFromTime() {
		return fromTime;
	}

	public void setFromTime(Timestamp fromTime) {
		this.fromTime = fromTime;
	}

	public Timestamp getToTime() {
		return toTime;
	}

	public void setToTime(Timestamp toTime) {
		this.toTime = toTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getTotalPeople() {
		return totalPeople;
	}

	public void setTotalPeople(int totalPeople) {
		this.totalPeople = totalPeople;
	}

	public int getFilledPeople() {
		return filledPeople;
	}

	public void setFilledPeople(int filledPeople) {
		this.filledPeople = filledPeople;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPictures() {
		return pictures;
	}

	public void setPictures(byte[] pictures) {
		this.pictures = pictures;
	}

}
