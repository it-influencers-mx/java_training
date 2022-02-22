package com.accenture.chapter5.abstractClasses;

public class ConcreteClassesExample {

}

abstract class Animal {
	public abstract String getName();
	public abstract int getAge();
}

abstract class Mammal extends Animal {
	public int getAge() {
		return 0;
	}
}

class Dog extends Mammal {
	public String getName() {
		return "";
	}
}