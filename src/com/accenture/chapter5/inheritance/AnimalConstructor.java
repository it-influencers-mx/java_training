package com.accenture.chapter5.inheritance;

public class AnimalConstructor {
	private int age;
	private String name;
	
	public AnimalConstructor(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public AnimalConstructor(int age) {
		super();
		this.age = age;
		this.name = null;
	}
}
