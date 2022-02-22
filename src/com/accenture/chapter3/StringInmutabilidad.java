package com.accenture.chapter3;

public class StringInmutabilidad {

	public static void main(String[] args) {
		//Ejemplo 1
		String str1 = "  123 ";
		str1 = str1.trim(); // Devuelve otro objeto que contiene "123"
		System.out.println(str1); // "123";

		//Ejemplo 2
		String a = "Hola ";
		String b = "Mundo";
		a.concat(b);
		System.out.println(a); // "Hola "
		
		//Ejemplo 3
		String a1 = "hola";
		a1.substring(2).concat("123").toUpperCase(); //No se está guardando la referencia regresada por estas operaciones. El str origina no se modifica.
		System.out.println(a1); // "hola" 
	}
}
