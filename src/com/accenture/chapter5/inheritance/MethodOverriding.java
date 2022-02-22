package com.accenture.chapter5.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverriding {
	public static void main(String[] args) {
		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
	}
}

//Ejemplo 1
class Canine {
	public double getAverageWeight() {
		return 50;
	}
}

class Wolf extends Canine {
	public double getAverageWeight() {
		return super.getAverageWeight() + 20;
		// return getAverageWeight() + 20; //Ciclo infinito.
	}
}

//Ejemplo 2
class Camel {
	protected String getNumberOfHumps() {
		return "Undefined";
	}
}

class BactrianCamel extends Camel {
	private int getNumberOfHumps() { // DOES NOT COMPILE 1. Menos accesible, 2. Tipo de retnorno distinto.
		return 2;
	}
}

//Ejemplo 3
class InsufficientDataException extends Exception {

}

class Reptile {
	protected boolean hasLegs() throws IOException {
		throw new IOException();
	}

	protected double getWeight() throws Exception {
		return 2;
	}
	
	public CharSequence getCharSequence() {
		return "";
	}

	//////

	protected double getHeight() throws InsufficientDataException {
		return 2;
	}

	protected int getLength() {
		return 10;
	}
}

class Snake extends Reptile {
	protected boolean hasLegs() throws  NullPointerException, FileNotFoundException {
		return false;
	}

	protected double getWeight() throws InsufficientDataException {
		return 2;
	}
	
	public StringBuilder getCharSequence() {
		return new StringBuilder();
	}

	////

	protected double getHeight() throws Exception { 		//No compila. La exception es más "grande" que la declarada en el método padre.
		return 2;
	}

	protected int getLength() throws InsufficientDataException { //No compila. Esta agregando una exception que no está declarada en la clase padre.
		return 10;
	}

}
