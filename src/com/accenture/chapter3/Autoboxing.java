package com.accenture.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
	public static void main(String[] args) {
		
		//Ejemplo 1
		List<Double> weights = new ArrayList<>();
		weights.add(50.00); 				// [50.5]
		weights.add(new Double(60)); 	// [50.5, 60.0]
		weights.remove(50.5); 			// [60.0]
		double first = weights.get(0); 	// 60.0
		Double firstO = weights.get(0); // 60.0
		
		
		
		//Ejemplo 2
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		//int h = heights.get(0); 	// NullPointerException
		Integer hO = heights.get(0); 
		
		
		
		//Ejemplo 3
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);				//Remueve el índex 1, no el objeto 1.
		System.out.println(numbers);	//[1]
		numbers.remove(new Integer(1));	//Remueve el el objeto 1.
		System.out.println(numbers);	//[]
		
		
		
		
		//Ejemplo 4
		boolean testIntegerRef = new Integer(1) == new Integer(1);
		boolean testIntegerEquals = new Integer(1).equals(new Integer(1));
		boolean testIntegerUnboxing = new Integer(1) == 1;
		System.out.println(testIntegerRef);			//false. Compara la referencia de memoria.
		System.out.println(testIntegerEquals);		//true.  Compara los valores.
		System.out.println(testIntegerUnboxing);	//true.  Compara los valores.
	}
}
