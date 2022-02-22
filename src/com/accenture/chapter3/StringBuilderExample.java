package com.accenture.chapter3;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		//Ejemplo 1 - String
		System.out.println("1-------------------------");
		String test = "";
		for(char current = 'a'; current <= 'z'; current++) {
			test += current;	  //En cada iteración se crea un nuevo String en memoria e inmediatamente en la siguiente
								  // iteración su valor es reemplazado y es elegible para ser gc.
		}
		System.out.println(test); // Imprime "abc...z"
		
		
		
		//Ejemplo 2 - StringBuilder
		System.out.println("2-------------------------");
		StringBuilder testSb = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++) {
			testSb.append(current);	  	//En cada iteración se modifica el mismo objeto creado antes del ciclo for.
		}
		System.out.println(test); // Imprime "abc...z"
		
		
		
		//Ejemplo 3 - Creación StringBuilder
		System.out.println("3-------------------------");
		StringBuilder sb1 = new StringBuilder();	//Crea un StringBuilder con una cadena vacía.
		StringBuilder sb2 = new StringBuilder(sb1); //Crea un StringBuilder a partir de otro StringBuilder.
		StringBuilder sb3 = new StringBuilder(10);	//Crea un StringBuilder con una capacidad inicial de 10. El default es 16.
		StringBuilder sb4 = new StringBuilder("");	//Crea un StringBuilder a partir de un String.
		
		
		
		//Ejemplo 4 - Mutabilidad y encadenamiento
		System.out.println("4-------------------------");
		StringBuilder sb = new StringBuilder("inicio");
		sb.append("+mitad"); 							// sb -> "inicio+mitad"
		StringBuilder same = sb.append("+fin"); 		// sb -> "inicio+mitad+fin"
		System.out.println(sb == same); 				// true
		sb.append("+1");
		System.out.println(same); 						// "inicio+mitad+fin+1"
		same.append("+2").append("+3");					//	Es posible encadenar las llamadas a los métodos puesto que append devuelve una referencia de tipo StringBuilder que apunta hacia sí mismo.
		System.out.println(sb); 						// "inicio+mitad+fin+1+2+3"
		
		
		
		//Ejemplo 5 - StringBuilder no implementa el método equals a diferencia de String.
		System.out.println("5-------------------------");
		StringBuilder sba = new StringBuilder("hola");
		StringBuilder sbb = new StringBuilder("hola");
		System.out.println(sba == sbb); 							// false
		System.out.println(sba.equals(sbb)); 						// false
		System.out.println(sba.toString().equals(sbb.toString())); 	// true
		
		
		
		//Ejemplo 6 - Diferencia entre capacidad y tamaño
		System.out.println("6-------------------------");
		StringBuilder strB = new StringBuilder(5);			//Crea un StringBuilder con una capacidad inicial de 10.
		StringBuilder strBDefault = new StringBuilder();	// Default capacity 16.
		System.out.println(strB.capacity());		//5
		System.out.println(strBDefault.capacity());	//16	
		System.out.println(strB.length());			//0
		strB.append("123456");						//Se agregan 6 caracteres al SB.
		System.out.println(strB.capacity());		//12   La capacidad se incrementa automáticamente conforme se vaya necesitando. 
													//	   Para el examen no es necesario saber cómo ni en cuánto se incrementa.
		System.out.println(strB.length());			//6
	}
}
