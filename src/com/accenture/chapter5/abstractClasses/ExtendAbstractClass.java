package com.accenture.chapter5.abstractClasses;

public class ExtendAbstractClass {

}

//Ejemplo 1
abstract class Animal {
	public abstract String getName();
}

class Walrus extends Animal { // DOES NOT COMPILE. No es abstracto y no implementa el método getName().
}

abstract class Eagle extends Animal {
}

//Ejemplo 2 - Se implementa el método en la clase concreta.
abstract class BigCat extends Animal {
	public abstract void roar();
}

class Lion extends BigCat {
	public String getName() {
		return "Lion";
	}

	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}
