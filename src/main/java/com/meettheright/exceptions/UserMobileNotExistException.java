package com.meettheright.exceptions;

public class UserMobileNotExistException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -143139078121842343L;

	@Override
	public String toString() {
		return "Mobile not exist";
	}

}
