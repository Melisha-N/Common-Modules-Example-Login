package com.wolken.wolkenapp.custom;

public class UserNameExistsException extends Exception {
	@Override
	public String toString() {
		return "Username already exists!!";
	}

}
