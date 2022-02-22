package com.accenture.chapter5.abstractClasses;

public abstract class Animal {
	protected int age;

	public void eat() {
		System.out.println("Animal is eating");
	}

	public abstract String getName();
}

class Swan extends Animal {
	public String getName() {
		return "Swan";
	}
}

//Es posible volver a redeclarar un método como abstracto.
abstract class SwanB extends Swan {
	public abstract String getName();
}

class SwanC extends SwanB {
	public String getName() {
		return "SwanX";
	}
}
