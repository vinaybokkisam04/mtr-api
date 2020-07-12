package com.meettheright.model;

import java.awt.Point;

public class Places_Sub2_Details {
	private int placeSub2Id;
	private int subCatId;
	private String name;
	private byte[] pictures;
	private Point location;
	private String description;
	private int noOfRequests;

	public int getPlaceSub2Id() {
		return placeSub2Id;
	}

	public void setPlaceSub2Id(int placeSub2Id) {
		this.placeSub2Id = placeSub2Id;
	}

	public int getSubCatId() {
		return subCatId;
	}

	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
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

	public int getNoOfRequests() {
		return noOfRequests;
	}

	public void setNoOfRequests(int noOfRequests) {
		this.noOfRequests = noOfRequests;
	}

}
