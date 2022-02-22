package com.accenture.chapter3.repaso;

public class ArreglosCasteo {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		String[] strings = { "ejemplo1" };
		Object[] objects = strings;
		String[] otherStringArray = (String[]) objects;
		System.out.println(otherStringArray[0]);
		
		
		//Ejemplo 2
		byte[] byteArray = {1, 2, 3};
		int[] intArray = byteArray; 				
		byte[] otherByteArray = (byte[]) intArray; 
		System.out.println(otherByteArray[0]);
	}
	
}
