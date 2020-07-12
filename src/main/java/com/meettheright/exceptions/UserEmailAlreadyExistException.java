package com.meettheright.exceptions;

public class UserEmailAlreadyExistException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -143139078121842343L;

	@Override
	public String toString() {
		return "Email already exist";
	}

}
