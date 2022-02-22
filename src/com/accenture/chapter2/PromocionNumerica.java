package com.accenture.chapter2;

public class PromocionNumerica {
	public static void main(String[] args) {
		char c = 1;
		byte b = 2;
		short s = 3;
		int i = 4;
		long l = 5L; // Aquí no se ocupa la L, puesto que el int cabe perfectamente en el tipo long.
		float f = 6.5f;
		float m = 6; // Aquí no se ocupe la f, puesto que el número es identificado como int.
		double d = 7.5;
		
		//Regla 1. Tipo de dato más pequeño promocionado al más grande.
		long a1 = i / l; // i -> long 
		double a2 = f * d; // f -> double
		long a3 = s + b + i * l; 
		//1. i -> long * l = long
		//2. s -> int + b -> int = int
		//3. Resultado de 2. int -> long + Resultado de 1. (long) = long.
		
		//Regla 2. Si uno de los operandos es de tipo entero y el otro de punto flotante, se convierte el entero a flotante.
		float b1 = l + f;
		double b2 = c + d;
		float b3 = s / f;
		
		//Regla 3. Los tipos de dato enteros más pequeños que int, son automáticamente promovidos a int al ser utilizados en una operación.
		int c1 = s + s; // s -> int 
		
		
		//short c2 = s + s; //No compila, s-> int. El resultado de int + int es int
		//short c3 = s + 1; //No compila, s-> int. El resultado de int + int es int
		
		
		int c4 = c + s; // c -> int; s -> int
		short c5 = ++s; //Esta regla no aplica para los operadores unarios.
		short c6 = --s; //Esta regla no aplica para los operadores unarios.
		
		//Regla 4. El tipo de dato resultante será el tipo de dato de los operandos promovidos
		int d1 = s + i; // s-> int
		double d2 = f / d; // f -> double
		long d3 = i - l; // i -> long
		float d4 = s + f; // s-> float
		
		double x = 1.5; 
		//float y = 1.5; // No compila, le hace falta una f.  
		//double result = x + y;

		long testA = 1;
		double testC = 1.5;
		float testB = 1.5f;
		//float test = (float) testA + testB + testC;
	}
}
