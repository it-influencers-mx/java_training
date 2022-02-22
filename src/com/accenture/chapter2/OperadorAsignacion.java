package com.accenture.chapter2;

public class OperadorAsignacion {
	
	public static void main(String args[]) {
		
		//*********Ejemplos asignación*******************************************************************************
		
		//* No compilan *//
//		int x = 1.0; 
//		short y = 1,921,222; //Valor máximo short 32767
//		int z = 9f;
//		long t = 192301398193810323;
//		long t = (long) 192301398193810323;
		
		//* Si Compilan *//
		int x = (int) 1.9;
		short y = (short) 1921222; //Almacenado como 20678 //Valor máximo short 32767
		int z = (int) 9f; 
		long t = 192301398193810323L;
		
		
		//*********Ejemplos promocion numerica de char, byte, short a int automaticamente****************************
		
		short x1 = 10;
		short y1 = 3;
		//short z = x1 * y1; // No compila
		//short z2 =  (short) x1 * y1; //No compila
		short z3 = (short) (x1 * y1);
		
		byte w = 1;
		char w1 = 'c';
		// short w3 = w + w1; //No Compila
		int w4 = w + w1;
		short w5 = (short) (w + w1);

		//System.out.println((char)('a' + 1));
	}
	
}
