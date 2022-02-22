package com.accenture.chapter3;

public class ArreglosEjemplo {
	public static void main(String args[]) {
		
		//Ejemplo 1
		int[] numbers = new int[10];
		for(int number : numbers) {
			System.out.println(number + 1);
		}
		
		
		
		//Ejemplo 2
		int[] numbersA = new int[10];
		for(int i = 0; i < 10; i++) {
			System.out.println(numbersA[i] + 1);
		}
		
		
		
		//Ejemplo 3
		int[] numbersB = new int[10];
		System.out.println(numbersB.length); 		//10
		//System.out.println(numbersB.length()); 	// No compila. length es una propiedad no un m�todo.
		
		
		
		//Ejemplo 4
		int[] numbersC = new int[10];
		for(int i = 0; i < 10; i++) {
			numbersC[i] = i + 1;
		}
		System.out.println(numbersC[9]); 					// 10
		System.out.println(numbersC[numbersC.length - 1]);  // 10
		//System.out.println(numbersC[10]); 				// Lanza una Excepci�n. El �ndice 10 est� fuera de rango.
		//System.out.println(numbersC[numbersC.length]); 	// Lanza una Excepci�n. El �ndice 10 est� fuera de rango.
	}
}
