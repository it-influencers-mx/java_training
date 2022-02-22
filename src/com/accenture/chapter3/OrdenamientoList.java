package com.accenture.chapter3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenamientoList {
	public static void main(String[] args) {
		
		//Ejemplo 1
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		Collections.sort(numbers);
		System.out.println(numbers); // [5, 81, 99]
		
		
		
		//Ejemplo 2
		List<String> cadenas = new ArrayList<>();
		cadenas.add("a");
		cadenas.add("1");
		cadenas.add("9");
		cadenas.add("A");
		Collections.sort(cadenas);
		System.out.println(cadenas); // [1 9 A a]
		

		
		//Ejemplo 3
		List<StringBuilder> strBuilders = new ArrayList<>();
		strBuilders.add(new StringBuilder("a"));
		strBuilders.add(new StringBuilder("A"));
		//Collections.sort(strBuilders);		//No compila. StringBuilder no implementa Comparable.
		
		
		
		//Ejemplo 4
		List generics = new ArrayList();
		generics.add(new StringBuilder("a"));
		generics.add(new StringBuilder("A"));
		//Collections.sort(generics);				//Si compila, pero lanza un ClassCastException.
		
	}
}
