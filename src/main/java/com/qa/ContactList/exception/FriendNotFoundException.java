package com.qa.ContactList.exception;

public class FriendNotFoundException extends RuntimeException{ //sigh
	public FriendNotFoundException(String message) {
		super(message);
	}

}
