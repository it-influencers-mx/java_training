package com.accenture.chapter3;

import java.time.LocalDate;
import java.util.Arrays;

public class ArreglosOrdenacion {
	public static void main(String args[]) {
		
		//Ejemplo 1 - Sorting numbers
		System.out.println("1-------------------------");
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print (numbers[i] + " "); //1 6 9
		
		
		//Ejemplo 2 - Sorting Strings
		System.out.println();
		System.out.println("2-------------------------");
		String[] strings = {"10", "9", "100", "c", "M" };
		Arrays.sort(strings);
		for (String string : strings)
			System.out.print(string + " "); // 10 100 9 M c 
		
		
		
		//Ejemplo 3 - Sorting Objects
		System.out.println();
		System.out.println("3-------------------------");
		Object[] objects = { new Object(), new Object(), new Object() };
		
		//Arrays.sort(objects);		//Excepción en tiempo de ejecución. ClassCastException Object cannot be cast to Comparable
									//La clase debe implmentar la interfaz "Comparable" para poder ser ordenada.
		for (Object obj : objects)
			System.out.print(obj + " ");
		
		
		
		//Ejemplo 4 - Sorting Dates (LocalDate implementa Comparable)
		//En caso de que se presente en el examen una clase diferente a String, se especificará en la desc de la pregunta
		//si la misma implementa Comparable.
		System.out.println();
		System.out.println("4-------------------------");
		LocalDate[] dates = {LocalDate.now(), LocalDate.MIN, LocalDate.MAX };
		Arrays.sort(dates);
		for (LocalDate date : dates)
			System.out.print(date + " ");
	}
}
