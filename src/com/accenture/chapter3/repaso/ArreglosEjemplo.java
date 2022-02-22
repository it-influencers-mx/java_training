package com.accenture.chapter3.repaso;

public class ArreglosEjemplo {
	public static void main(String args[]) {
		
		//Ejemplo 1
		int[] numbers = new int[10];
		for(int number : numbers) {
			System.out.println(number + 1);
		}
		
		
		
		//Ejemplo 2
		int[] numbersA = new int[10];
		for(int i = 0; i <= 10; i++) {
			System.out.println(numbersA[i] + 1);
		}
		
		
		
		//Ejemplo 3
		int[] numbersC = new int[10];
		for(int i = 0; i < 10; i++) {
			numbersC[i] = i + 1;
		}				
		System.out.println(numbersC[numbersC.length]);
	}
}
