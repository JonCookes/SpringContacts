package com.qa.ContactList.exception;

public class FriendNotFoundException extends RuntimeException{ //sigh2
	public FriendNotFoundException(String message) {
		super(message);
	}

}
