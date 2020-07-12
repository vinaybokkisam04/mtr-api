package com.meettheright.model;

import java.awt.Point;

public class User_Profiles {
	private String userName;
	private String name;
	private byte[] pictures;
	private int age;
	private String gender;
	private Point location;
	private String description;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getPictures() {
		return pictures;
	}

	public void setPictures(byte[] pictures) {
		this.pictures = pictures;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
