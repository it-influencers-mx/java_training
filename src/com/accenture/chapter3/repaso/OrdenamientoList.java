package com.accenture.chapter3.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenamientoList {
	public static void main(String[] args) {
		
		//Ejemplo 1
		List<Integer> numbers = new ArrayList<>();
		numbers.add(-1);
		numbers.add(-10);
		numbers.add(10);
		numbers.add(0);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
		
		//Ejemplo 2
		List<String> cadenas = new ArrayList<>();
		cadenas.add("b");
		cadenas.add("2");
		cadenas.add("22");
		cadenas.add("Z");
		cadenas.add("1");
		Collections.sort(cadenas);
		System.out.println(cadenas); 
		
		
		
		
		//Ejemplo 3 - Nota:StringBuilder no implementa Comparable
		List generics = new ArrayList();
		generics.add(new StringBuilder("a"));
		generics.add(new StringBuilder("A"));
		//Collections.sort(generics);
		System.out.println(generics); 
		
		
		
		//Ejemplo 4 - Nota:StringBuilder no implementa Comparable
		List<StringBuilder> strBuilders = new ArrayList<>();
		strBuilders.add(new StringBuilder("b"));
		strBuilders.add(new StringBuilder("B"));
		//Collections.sort(strBuilders);
		System.out.println(strBuilders);
		
		
		
		//Ejemplo 5
		String[] arregloList = {"a", "b", "1", "X"};
		List<String> listArray = Arrays.asList(arregloList);
		Collections.sort(listArray);
		System.out.println(listArray);
		System.out.print(Arrays.toString(arregloList)); 
	}
}
