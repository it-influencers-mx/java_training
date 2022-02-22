package com.accenture.chapter4;

public class Varargs {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		testVarargsIntegers(1, 1, 2, 3, new Integer(4)); //4
		
		//Ejemplo 2
		testVarargsIntegers(1); //0
		
		//Ejemplo 3
		testVarargsIntegers(1, new Integer[5]); //5
		
		//Ejemplo 4
		testVarargsIntegers(1, null); //NullPointerException
		
		
	}
	
	private static void testVarargsIntegers(int num, Integer...integers) {
		System.out.println(integers.length);
		
		if(integers.length > 0) {
			System.out.println(integers[0]);
		}
	}

//	private static void testVarargsIntegers(int num, Integer...integers, String...strings) { // No compila, solo podemos tener un varargs.
//	
//	}
	
//	private static void testVarargsIntegers(Integer...integers, String string) { // No compila, el parámetro vargars debe ser el último parámetro del método.
//	
//	}
	
}
