package com.accenture.chapter3;

public class StringEncadenamientoMetodos {
	public static void main(String[] args) {
		//Ejemplo 1
		String start = "AniMaL    ";					//"AniMaL    "
		String trimmed = start.trim();					//"AniMaL"
		String lowercase = trimmed.toLowerCase();		//"animal"
		String result = lowercase.replace('a', 'A');	//"AnimAl"
		System.out.println(result);
		
		String result1 = "AniMaL    ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result1);					//"AnimAl"
		
	
		//Ejemplo 2
		String test = "Hola ";
		test.concat("mundo").toUpperCase();
		System.out.println(test); 	//"Hola " . El String no se modificó, no se asignó de nuevo a la variable.
		
		
		//Ejemplo 3
		System.out.println("\tabc   ".toUpperCase().trim().concat("").concat("D").equals("ABCD")); //true
	}
}
