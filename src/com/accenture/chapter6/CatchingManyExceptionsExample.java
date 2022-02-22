package com.accenture.chapter6;

public class CatchingManyExceptionsExample {

	public static void main(String args[]) {
		visitPorcupine();
	}

	// Ejemplo 1
	public static void visitPorcupine() {
		try {
			seeAnimals();
		} catch (AnimalsOutForAWalk e) { // first catch block
			System.out.print("try back later");
		} catch (ExhibitClosed e) { // second catch block
			System.out.print("not today");
		}
	}

	// Ejemplo 2
	public void visitMonkeys() {
		try {
			seeAnimals();
		} catch (ExhibitClosedForLunch e) { // subclass exception
			System.out.print("try back later");
		} catch (ExhibitClosed e) { // superclass exception
			System.out.print("not today");
		}
	}

	// Ejemplo 3 - Bad Superclass before subclass
	public void visitMonkeysBad() {
		try {
			seeAnimals();
		} catch (ExhibitClosed e) {
			System.out.print("not today");
		} catch (ExhibitClosedForLunch e) { // DOES NOT COMPILE
			System.out.print("try back later");
		}
	}

	// Ejemplo 4 Bad Superclass before subclass
	public void visitSnakes() {
		try {
			seeAnimals();
		} catch (RuntimeException e) {
			System.out.print("runtime exception");
		} catch (ExhibitClosed e) {// DOES NOT COMPILE
			System.out.print("not today");
		} catch (Exception e) {
			System.out.print("exception");
		}
	}

	static void seeAnimals() {
		System.out.println("Seeing animals...");
	}
}

class AnimalsOutForAWalk extends RuntimeException {
}

class ExhibitClosed extends RuntimeException {
}

class ExhibitClosedForLunch extends ExhibitClosed {
}
