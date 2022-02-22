package com.accenture.chapter3;

public class ArreglosReferencias {
	String[] nombres; //Se inicializa en null como los otros objetos. Cap 2.
	
	public static void main(String... args) {
		
		//Ejemplo 1 - equals
		System.out.println("1----------------");
		String x = new String("x");
		String [] bugs = { "cricket", "beetle", "ladybug", x };
		String [] bugs1 = { "cricket", "beetle", "ladybug", x };
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs == alias); 		// true
		System.out.println(bugs.toString()); 	// [Ljava.lang.String;@160bc7c0
		System.out.println(bugs[3] == bugs1[3]);
		
		
		
		//Ejemplo 2 - equals
		System.out.println("2----------------"); 	
		Integer numbers[] = {1, 2, 3, 4};
		Integer numbers2[] = {1, 2, 3, 4};
		System.out.println(numbers.equals(numbers2)); 	// false
		System.out.println(numbers == numbers2); 		// false
		//System.out.println(bugs == numbers2); 		// No compila. No podemos comparar tipos que no están relacionados.
		System.out.println(numbers.toString()); 		// [Ljava.lang.Integer;@160bc7c0
		
		
		
		//Ejemplo 3 - length
		System.out.println("3----------------"); 	
		String[] arreglo = new String[10];
		String[] arregloA = {null, null, null};
		System.out.println(arreglo.length); 	//10
		System.out.println(arregloA.length); 	//3
		
	
		
		//Ejemplo 4 - Inicialización default de los elementos del arreglo.
		System.out.println("4----------------"); 	
		Integer numbersA[] = new Integer[10]; //Los elementos del arreglo son inicializados en null, puesto que Integer es un objeto.
		int numbersB[] = new int[10]; 		  //Los elementos del arreglo son inicializados en 0, puesto que int es un tipo de dato primitivo.
	
		//Imprime "null" 10 veces
		for(Integer i : numbersA) {
			System.out.print(i + " "); 	
		}
		
		//Imprime "0" 10 veces
		for(Integer i : numbersB) {
			System.out.print(i + " "); 	
		}
	}
}
