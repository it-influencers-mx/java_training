package com.accenture.chapter3.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertirArregloList {
	
	public static void main(String[] args) {
		
		//Ejemplo 1
		List<String> numbers = new ArrayList<>();
		numbers.add("1");
		numbers.add("2");
		//String[] arreglo = numbers.toArray();
		//System.out.println(arreglo[0]);
		
		
		
		
		//Ejemplo 2
		List<String> names = new ArrayList<>();
		names.add("Juan");
		names.add("Pedro");
		String[] namesA = (String[]) names.toArray();
		System.out.println(namesA[0]);
		
		
		
		
		//Ejemplo 3
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		String[] arregloA = list.toArray(new String[0]);
		System.out.println(arregloA.length);
		System.out.println(arregloA[1]); 
		
		
		
		
		//Ejemplo 4
		String[] array = { "leon", "tigre", "gato" }; 		
		List<String> listA = Arrays.asList(array);
		System.out.println(listA.size()); 			
		listA.set(1, "jaguar"); 						
		array[0] = "pantera"; 							
		for (String b : array) 
			System.out.print(b + " "); 
		listA.remove(1);						
		
		
		
		
		//Ejemplo 5
		List<String> listB = Arrays.asList("a", "b", "c"); 
		for (String b : listB) 
			System.out.print(b + " "); 							
		listB.add("d");
		
	}
	
}
