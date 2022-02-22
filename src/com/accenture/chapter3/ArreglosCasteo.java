package com.accenture.chapter3;

public class ArreglosCasteo {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder(); 	// No compila
		//objects[0] = new StringBuilder(); 		// Lanza un ArrayStoreException en tiempo de ejecución.
		
		
		
		//Ejemplo 2
		byte[] byteArray = {1, 2, 3};
		//int[] intArray = byteArray; 			// No compila. Los tipos primitivos no pueden ser casteados entre ellos directamente.
		//int[] intArray = (int[]) byteArray; 	// No compila. 
		
		
		
		//Ejemplo 3
		//CharSequence es una interfaz que implementan tanto String como StringBuilder
		CharSequence[] charSequenceArray;
		String[] stringArray = {"1", "2", "3"};
		StringBuilder[] stringBuilderArray = { new StringBuilder("1") };
		charSequenceArray = stringArray; 			//Compila
		charSequenceArray = stringBuilderArray; 	//Compila
		Object[]  mmm = stringArray;
		Object[]  kkkk = stringBuilderArray;
	}
	
}
