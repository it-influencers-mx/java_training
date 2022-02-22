package com.accenture.chapter5.interfaces;

public class InterfaceStaticMethods {

}

//Ejemplo 1
interface Hop {
	static int getJumpHeight() {
		return 8;
	}
}

class Bunny implements Hop {
	public void printDetails() {
		System.out.println(getJumpHeight()); // DOES NOT COMPILE. Se tiene que acceder utilizando el nombre de la
												// interfaz.
	}
}

class BunnyCorrect implements Hop {
	public void printDetails() {
		System.out.println(Hop.getJumpHeight());
	}
}



//Ejemplo 2
interface Persona {
	static void comer() {}
}

interface Animal {
	static void comer() {}
}

class TestStatic implements Persona, Animal { // Compila sin problema, los métodos estáticos no son heredados.
	public void test() {
		Persona persona;
		persona.comer(); //No compila, no podemos acceder a los métodos estáticos de la interfaz mediante una variable.
		Persona.comer();
	}
}

