package com.wolken.wolkenapp.custom;

public class ContactException  extends Exception{
	@Override
	public String toString() {
		return "Contact info Provided is null";
	}

}
