package com.accenture.chapter3.repaso;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
	public static void main(String[] args) {
		
		//Ejemplo 1
		List<Double> numbers = new ArrayList<>();
		numbers.add(50.5); 	
		numbers.add(1f); 	//Float	
		numbers.add(50); 	//Integer	
				
		
		
		//Ejemplo 2
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		int h = heights.get(0);
		Integer hO = heights.get(0); 
		
		
		
		//Ejemplo 3
		List<Integer> numbersA = new ArrayList<>();
		numbersA.add(new Integer(1));
		numbersA.add(2);
		numbersA.remove(1);				
		System.out.println(numbersA);
		numbersA.remove(new Integer(1));	
		System.out.println(numbersA);	
		
		
		
		
		//Ejemplo 4
		boolean a = new Integer(1) == new Integer(1);
		boolean b = new Integer(1).equals(new Integer(1));
		boolean c = new Integer(1) == 1;
		System.out.println(a);			
		System.out.println(b);		
		System.out.println(c);
		
		
		
		//Ejemplo 5
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(null);
		
		for(int x : list)
			System.out.println(x);
	}
}
