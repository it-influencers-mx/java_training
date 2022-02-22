package com.accenture.chapter2;

public class OperadorAsignacionCompuesta {
	
	//int w9 += 2; //No compila
	
	int p1;
	{
		p1 += 2;
	}
	
	public static void main(String args[]) {
		int x = 2, z = 3;
		x = x * z; //Asignación simple
		x *= z; //Asignación compuesta (Equivalente al anterior)
		
		//int w += 2; //No compila
		int y;
		//y += 2; // No compila
		
		//Casteo implícito
		long x1 = 10;
		int y1 = 5;
		y1 =   y1 * (int) x1; //Si Compila
		y1 *= x1; // Si Compila
		//y1 = y1 * x1; // No compila
		
		int w = 1;
		char w1 = 'c';
		w1 += w; // Si Compila 
		
		//int m += 1; //No compila, el valor de m no está inicializado aún.
		
		//https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.26
		//Operadores de asignación son sintácticamente right-associative (Se agrupan de derecha a izquierda).
		int abc = 10;
		int a1, b1, c1;
		a1 = b1 = c1 = abc; 
	}
	
}
