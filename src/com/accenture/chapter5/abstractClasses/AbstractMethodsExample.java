package com.accenture.chapter5.abstractClasses;

public class AbstractMethodsExample {

}

//Ejemplo 1
abstract class Cow {
}

//Ejemplo 2
class Chicken {
	public abstract void peck(); // DOES NOT COMPILE. La clase debe ser abstracta.
}

//Ejemplo 3
abstract class Turtle {
	public abstract void swim() {} // DOES NOT COMPILE. No deben contener cuerpo.

	public abstract int getAge() { // DOES NOT COMPILE. No deben contener cuerpo.
		return 10;
	}
}

//Ejemplo 4
abstract class Goat {
	public abstract final void chew(); // DOES NOT COMPILE. No puede ser marcada como final.
}

//Ejemplo 5
abstract class Whale {
	private abstract void sing(); 		// DOES NOT COMPILE. No podemos marcarla como abstract y private.
}

class HumpbackWhale extends Whale {
	private void sing() {
		System.out.println("Humpback whale is singing");
	}
}