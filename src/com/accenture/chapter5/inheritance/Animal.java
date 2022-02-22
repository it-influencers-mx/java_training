package com.accenture.chapter5.inheritance;

public class Animal {
	private int age;
	private String color;

	//Public access
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//Default access
	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
}
