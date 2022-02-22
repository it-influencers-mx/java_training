package com.accenture.chapter2.repaso;

/**¿Cuál es el resultado de cada una de las siguientes operaciones */

public class Operadores {
	
	public static void main() {
		int value1 = 2;
		int value2 = 3;
		int value3 = 0;
		
		int result1 = value1 + value2 * value1 / 2 % 5;
		System.out.println("Result1:" + result1);
		
		int result2 = (value1 + value2) * value1 / 2 % 5;
		System.out.println("Result2:" + result2);
		
		int result3 = value1 * value2 / value3 + 1;
		System.out.println("Result3:" + result3);
	}
	
}
