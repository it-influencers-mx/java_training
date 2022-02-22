package com.accenture.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertirArregloList {
	
	public static void main(String[] args) {
		
		//Ejemplo 1 - List a Arreglo
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length); // 2
		String[] stringArray = list.toArray(new String[0]); 
		//Si el arreglo que se le pasa de parámetro tiene una longitud menor que el número de elementos, 
		//un nuevo arreglo es creado y devuelto.
		System.out.println(stringArray.length); // 2
		
		
		
		//Ejemplo 2 - Arreglo a List
		String[] array = { "hawk", "robin" }; 		// [hawk, robin]
		List<String> listA = Arrays.asList(array); 	// returns fixed size list
		System.out.println(listA.size()); 			// 2
		listA.set(1, "test"); 						// [hawk, test]
		array[0] = "new"; 							// [new, test]
		for (String b : array) 
			System.out.print(b + " "); 				// new test
		//listA.remove(1);							// throws UnsupportedOperation Exception
		//listA.add("HOLA");						// throws UnsupportedOperation Exception
		
		
		
		//Ejemplo 3 - Arreglo a List (Varargs)
		List<String> listB = Arrays.asList("a", "b", "c"); 	// returns fixed size list
		for (String b : listB) 
			System.out.print(b + " "); 				// a b c
		//listB.remove(1);							// throws UnsupportedOperation Exception
		//listB.add("HOLA");						// throws UnsupportedOperation Exception
	}
	
}
