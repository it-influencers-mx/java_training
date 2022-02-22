package com.accenture.chapter6;

public class CallingMethodsThrowingExceptions {
	public static void main(String[] args) {
		
	}
	
	//Ejemplo 1
	static void testEatCarrotIncorrect() {
		eatCarrot();// DOES NOT COMPILE. Neceistamos manejarla (try/catch) o declararla.
	}
	
	//Ejemplo 2
	static void testEatCarrotDeclaringException() throws NoMoreCarrotsException {
		eatCarrot();
	}
	
	//Ejemplo 3
	static void testEatCarrotHandlingException() {
		try {
			eatCarrot();
		} catch(NoMoreCarrotsException ex) {
			
		}
	}
	
	//Ejemplo 4
	static void testEatCarrotNoException() {
		try {
			eatCarrotNoException();
		} catch(NoMoreCarrotsException ex) { // No compila. El método anterior no lanza este tipo de excepción.
			
		}
	}

	private static void eatCarrot() throws NoMoreCarrotsException {}
	
	private static void eatCarrotNoException() {}
}

class NoMoreCarrotsException extends Exception {}
