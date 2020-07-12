package com.meettheright.model;

public class Response {

	private Object data;

	private Boolean success;

	private String sucessMessage;

	private String errorMessage;

	public Response() {
		super();
	}

	public Response(Object data, Boolean success, String sucessMessage, String errorMessage) {
		super();
		this.data = data;
		this.success = success;
		this.sucessMessage = sucessMessage;
		this.errorMessage = errorMessage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getSucessMessage() {
		return sucessMessage;
	}

	public void setSucessMessage(String sucessMessage) {
		this.sucessMessage = sucessMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
