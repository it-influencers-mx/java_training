package com.accenture.chapter2;

public class OperadorTernario {
	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		
		//boolean w = x == 1 ? "true" : false; // No compila
		
		// x == 1 ? "true" : false; // No compila
		
		boolean z = x == 1 ? true : false; //Regresan el mismo tipo de dato, obligado por su uso en una asignación.
		
		System.out.println(x == 1 ? x++ : ""); //Regresa distinto tipo de dato.
		
		int i = x == 1 ? y++ : x--;
		
		// Es posible anidar operadores ternarios.
		// Los paréntesis no son requeridos, pero ayudar a la legibilidad del código. 
		int j = x > 0 ?  x < 10 ? 5 : 8 : -1 ; 
		int j1 = (x > 0) ? (x < 10) ? 5 : 8 : -1 ; 
		System.out.println("Resultado op tern: " + j);
		
		
		//Solo una de las dos expresiones de un operador ternario es ejecutada
		
		int b = 0;
		int u = 0;
		int c = b == 0 ? b++ : u++;
		System.out.println("b: " + b + ", u: " + u + ", c:" + c);
		
		
		int h = 0;
		System.out.print( h > 1 ? 1 : "Hola");
		Object animal = h > 1 ? 1 : "Hola";
		
	}
}
