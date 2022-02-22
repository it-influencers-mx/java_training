package com.accenture.chapter5.inheritance;

import com.accenture.chapter5.inheritance.Animal;

public class Lion extends Animal {
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}
	
	private void printColor() {
		System.out.println("The color is " + getColor());
	}
}
