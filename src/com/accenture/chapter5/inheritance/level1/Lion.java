package com.accenture.chapter5.inheritance.level1;

import com.accenture.chapter5.inheritance.Animal;

public class Lion extends Animal {
	private void roar() {
		System.out.println("The " + getAge() + " year old lion says: Roar!");
	}
	
	private void printColor() {
		// System.out.println("The color is " + getColor()); //No compila, el método getColor es default y solo accesible desde el mismo paquete.
	}
}
