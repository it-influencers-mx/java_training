package com.accenture.chapter5.inheritance;

public class Zebra extends AnimalConstructor {
	public Zebra(int age) {
		super(age);
	}

	public Zebra() {
		this(4);
	}
}
