package com.hello.test.model;

public class Helloworld {
	private String value= "Hello world";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return value;
	}
	
}
