package com.accenture.chapter2;

public class Operators {

	public static void main(String[] args) {
		int y = 4;
		double x = 3 + 2 * --y;
		System.out.println(x); //9.0
		
		//Mismo nivel de precedencia se evalua de izquierda a derecha
		int p = 3 * 5 / 5 * 10;
		System.out.println(p); //30
		
		//Sobreescribir el orden utilizando parentesis
		p = 3 * 5 / (5 * 10); 
		System.out.println(p); //0
		
		//Operadores aritméticos binarios
		int x1 = 2 * 5 + 3 * 4 - 8;
		System.out.println(x1); //14
		
		//Cambiando el orden de precedencia utilizando paréntesis
		x1 = 2 * ((5 + 3) * 4 - 8);
		System.out.println(x1); //48
		
		//Operador módulo
		int z = 10 % 2;
		System.out.println(z); //0
		
		z = 10 / 2;
		System.out.println(z); //5
		
		z = 10 % 3;
		System.out.println(z); //1
		
		/**
		 * Fuera del scope del examen, pero también válido.
		 * Se puede aplicar el operador módulo a operandos negativs y de punto flotante.
		 **/
		int c = -10 % 3;
		System.out.println(c); //-1
		
		float v = 10.1f % 2;
		System.out.println(v); //0.10000038
	}
}
