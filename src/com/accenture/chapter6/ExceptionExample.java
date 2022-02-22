package com.accenture.chapter6;

public class ExceptionExample {
	public static void main(String[] args) {
		// Ejemplo 1
		System.out.println(args[0]); // Si no mandamos ningún parámetro obtendremos un
										// ArrayIndexOutOfBoundsException.

		// Ejemplo 2
		createExceptionButNotThrowingIt();

		// Ejemplo 3
		createExceptionAndThrowingIt();
		
		//Ejemplo 4
		recoveringFromException();
	}

	private static void createExceptionButNotThrowingIt() {
		new RuntimeException();
		return;
	}

	private static void createExceptionAndThrowingIt() {
		throw new RuntimeException();
	}

	
	//Ejemplo 4 - Recuperandonos de una excepción
	private static void recoveringFromException() {
		explore();
	}

	static void explore() {
		try {
			fall();
			System.out.println("never get here");
		} catch (RuntimeException e) {
			getUp();
		}
		seeAnimals();
	}

	static void fall() {
		throw new RuntimeException();
	}
	
	static void seeAnimals() {
		System.out.println("Seeing animals...");
	}
	
	static void getUp() {
		System.out.println("Getting up...");
	}
	
	
	//Ejemplo 5 - No compila, try/catch requiere {}
	static void badTryExampleMissingCurlyraces(){
		/*  try  // DOES NOT COMPILE
			   fall();
			catch (Exception e)
			   System.out.println("get up");
		 */
	}
	
	//Ejemplo 6 - No compila, try/catch requiere {}
	static void badTryExampleMissingCatchOrFinllay(){
		/* try { // DOES NOT COMPILE
			  fall();
		   }
		*/
	}
}
