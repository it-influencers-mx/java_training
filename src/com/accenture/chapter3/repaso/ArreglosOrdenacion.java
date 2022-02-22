package com.accenture.chapter3.repaso;

import java.util.Arrays;

public class ArreglosOrdenacion {
	public static void main(String args[]) {
		
		//Ejemplo 1
		System.out.println("1-------------------------");
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print (numbers[i] + " ");
		
		
		
		//Ejemplo 2
		System.out.println();
		System.out.println("2-------------------------");
		String[] strings = {"10", "9", "100", "b" , "A"};
		Arrays.sort(strings);
		for (String string : strings)
			System.out.print(string + " ");
		
		
		
		//Ejemplo 3
		System.out.println();
		System.out.println("3-------------------------");
		Object[] objects = { new Object(), new Object(), new Object() };
		Arrays.sort(objects);
		for (Object obj : objects)
			System.out.print(obj + " ");
	}
}
