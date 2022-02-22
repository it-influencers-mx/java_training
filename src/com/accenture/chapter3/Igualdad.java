package com.accenture.chapter3;

import java.util.Date;

public class Igualdad {
	public static void main(String args[]) {
		//Ejemplo 1
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		
		System.out.println(one == two); 		// false
		System.out.println(one == three); 		// true
		System.out.println(one.equals(two)); 	// false . StrinBuilder no implementa equals, sigue revisando la referencia no el contenido.
		
		
		//Ejemplo 2
		Object t1 = new Object();
		Object t2 = new Object();
		Object t3 = t1;
		Date d1 = new Date();
		String str = "";
		System.out.println(t1 == t3); 			// true
		System.out.println(t1 == t2); 			// false
		System.out.println(t1.equals(t2)); 		// false
		System.out.println(d1.equals(str)); 	// false
		//System.out.println(d1 == str); 			// No compila, tipos incompatibles.
	}
}
