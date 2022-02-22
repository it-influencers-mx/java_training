package com.accenture.chapter2;

import java.io.IOException;

public class UnaryOperators {

	public static void main(String[] args)  {
		
		/////Operadores de complemento lógico y negación.
		
		boolean a = !true;
		boolean b = false;
		System.out.println(b); // false
		
		b = !b;
		System.out.println(b); // true
		
		double d = +1.5; // Es lo mismo que -> double d = 1.5;
		double d1 = -2.5;
		System.out.println(d); // 1.5
		
		d = -d;
		System.out.println(d); // -1.5
		
		d = -d;
		System.out.println(d); // 1.5
		
		d = +d;
		System.out.println(d); // 1.5
		
		d1 = +d1; // No modifica el valor de la variable.
		System.out.println(d1); // -2.5
		
		///Ejemplos de mal uso de operadores
		boolean b1 = false;
		//b1 = -b1; 	// No compila
		//b1 = -true; 	// No compila
		//int c1 = !0; 	// No compila
		
		
		///// Operadores de incremento y decremento
		
		int m = 4;
		int n = 3;
		int x9 = ++m + --n * m++ / --n;
		
		//Siguiendo la regla, evalua todos los unary operators al mismo nivel y luego continua con las operaciones de menor orden de precedencia.
		//Opcion 1 Regla: 5 + 2 * 5 / 1 = 15 
		
		//Opcion 2 : 5 + 2 * 4 / 1 =  13 // No evalua primero los operadores de multiplicación, sino todos los unarios como van apareciendo.
		System.out.println("x9: " + x9);
		
		int test = 0;
		if(test++ == 0) {
			System.out.println("Test:" + test);
		}
		
		int test2 = 0;
		if(++test2 == 0) {
			System.out.println("Test2:" + test2);
		}
	}
}
