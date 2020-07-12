package com.meettheright.model;

public class Sub_Categories {

	private int subCatId;
	private int mainCatId;
	private String subCatName;

	public long getSubCatId() {
		return subCatId;
	}

	public void setSubCatId(int subCatId) {
		this.subCatId = subCatId;
	}

	public long getMainCatId() {
		return mainCatId;
	}

	public void setMainCatId(int mainCatId) {
		this.mainCatId = mainCatId;
	}

	public String getSubCatName() {
		return subCatName;
	}

	public void setSubCatName(String subCatName) {
		this.subCatName = subCatName;
	}

}
