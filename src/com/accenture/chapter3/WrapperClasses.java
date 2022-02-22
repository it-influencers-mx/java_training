package com.accenture.chapter3;

public class WrapperClasses {
	public static void main(String args[]) {
		
		//Ejemplo 1
		int primitive = Integer.parseInt("123");
		Integer wrapper = Integer.valueOf("123");
		
		
		
		//Ejemplo 2
		//int bad1 = Integer.parseInt("a"); 			// throws NumberFormatException
		//Integer bad2 = Integer.valueOf("123.45"); 	// throws NumberFormatException
		//int binario = Integer.parseInt("0b101"); 		// throws NumberFormatException
		int binario = Integer.parseInt("0101", 2);	
		int binarioLiteral = 0b0101;
		
		
		
		//Ejemplo 3
		double goodDouble = 12.0_0;
		//float badFloat = Float.parseFloat("12.0_0");	// throws NumberFormatException
		float goodFloat1 = Float.parseFloat("12.00");
		float goodFloat2 = Float.parseFloat("12.00f");
	}
}
