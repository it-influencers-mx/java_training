package com.accenture.chapter2;

public class FlujoWhile {
	public static void main(String[] args) {
		
		//** No es posible "hardcodear" un valor de false, error de compilación por "Unreacheable code" aún y cuando el while esté vacío.
		final boolean EXP_FALSE = false;
		boolean exp_false = false;
		
		//while(EXP_FALSE) {}   // No compila. Unreacheable code. https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.21
		//while(false) {} 		// No compila. Unreacheable code.
		while(exp_false) {}     // Compila. El valor de la variable NO puede ser determinado en tiempo de compilación.
		
		
		//** La estructura while puede estar vacía.
		boolean expresion = false;
	
		while(expresion) { } 	// while vacío
		while(expresion); 		// while vacío
		
		
		//** Ciclos infinitos
		int x = 0;
		int y = 0;
		
		while(x < 10)				//Loop infinito
			System.out.println(x);  
			x++; 					//Esta variable está fuera del ciclo.
			
		while(y < 10) {				// Loop regular, esta sería la manera correcta de agrupar las dos sentencias.
			System.out.println(y); 
			y++;
		}
		
		//** Utilizando operadores unarios en condiciones.
		int z = 1;
		while(z++ > 1) { --z; }
		System.out.println("Z: " + z);  //Z : 2
	}
}
