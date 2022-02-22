package com.accenture.chapter3;

import java.time.LocalDate;
import java.util.Arrays;

public class ArreglosBusqueda {
	public static void main(String[] args) {
		
		//Ejemplo 1 - Areglo Ordenado (Natural order asc)
		System.out.println("1-------------------------");
		int[] numbersSorted = {2,4,6,8};
		System.out.println(Arrays.binarySearch(numbersSorted, 2)); // 0
		System.out.println(Arrays.binarySearch(numbersSorted, 4)); // 1
		System.out.println(Arrays.binarySearch(numbersSorted, 1)); // -1
		System.out.println(Arrays.binarySearch(numbersSorted, 3)); // -2
		System.out.println(Arrays.binarySearch(numbersSorted, 9)); // -5
		
		
		
		//Ejemplo 2 - Arreglo no ordenado
		System.out.println("2-------------------------");
		int[] numbers = new int[] {3,2,1};
		System.out.println(Arrays.binarySearch(numbers, 2));
		System.out.println(Arrays.binarySearch(numbers, 3));
		
		
		
		//Ejemplo 3 - Objetos
		System.out.println("3-------------------------");
		Object[] objects = { new Object(), new Object(), new Object() };
		//System.out.println(Arrays.binarySearch(objects, new Object()));		
		//Excepción en tiempo de ejecución. ClassCastException Object cannot be cast to Comparable
		//La clase debe implmentar la interfaz "Comparable" para poder ser ordenada.
		
		
		
		//Ejemplo 4 - Arreglo ordenado Dates (LocalDate implementa Comparable)
		//En caso de que se presente en el examen una clase diferente a String, se especificará en la desc de la pregunta
		//si la misma implementa Comparable.
		System.out.println();
		System.out.println("4-------------------------");
		LocalDate[] dates = {LocalDate.MAX, LocalDate.now(), LocalDate.MIN};
		Arrays.sort(dates);
		System.out.println(Arrays.binarySearch(dates, LocalDate.MIN));	//0
		
		
		
		//Ejemplo 5 - *Fuera del scope del examen. Multiples apariciones del mismo número
		//Cuando el número buscado aparece varias veces dentro del arreglo Java no garantiza cual
		//index será regresado.
		System.out.println("5-------------------------");
		int[] numbersA = {1,2,2,2,4};
		System.out.println(Arrays.binarySearch(numbersA, 2)); // 2
		
	}
}
