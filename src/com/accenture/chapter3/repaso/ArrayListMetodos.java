package com.accenture.chapter3.repaso;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMetodos {
	
	public static void main(String args[]) {
		
		//Ejemplo 1.a
		System.out.println("1.a-------------------------");
		ArrayList list = new ArrayList();
		list.add("Cadena"); 			
		list.add(Boolean.TRUE); 
		list.add(1); 
		System.out.println(list);
	
		
		
		//Ejemplo 1.b
		System.out.println("1.b-------------------------");
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("1");
		arrayList.add(Boolean.TRUE + ""); 
		arrayList.add(1);
		System.out.println(arrayList);
		
		
		
		//Ejemplo 1.c
		System.out.println("1.c-------------------------");
		List<String> birds = new ArrayList<>();
		birds.add("aguila");			
		birds.add(1, "golondrina");
		birds.add(0, "paloma"); 	
		birds.add(1, "gorrion"); 	
		System.out.println(birds); 	
		
		
		
		//Ejemplo 2
		System.out.println("2-------------------------");
		List<String> nombres = new ArrayList<>();
		nombres.add("Pedro"); 		
		nombres.add("Juan"); 								
		nombres.add("Pedro"); 	
		System.out.println(nombres.remove("Pedro"));
		System.out.println(nombres.remove(0)); 				
		System.out.println(nombres); 						
		System.out.println(nombres.remove("Luis")); 		
		System.out.println(nombres.remove(1)); 
		
		
		
		//Ejemplo 3
		System.out.println("3-------------------------");
		List<String> nums = new ArrayList<>();
		nums.add("1"); 					
		nums.set(0, "2"); 
		System.out.println(nums.size());
		nums.set(1, "3");
		
		
		
		
		//Ejemplo 4
		System.out.println("4-------------------------");
		List<String> animales = new ArrayList<>(10);
		System.out.println(animales.isEmpty()); 	
		System.out.println(animales.size()); 		
		animales.add("perro"); 				
		animales.add("gato"); 						
		
		List<String> animalesA = new ArrayList<>();
		animalesA.add(null); 						
		animalesA.add(null); 						
		System.out.println(animalesA);
		
		
		
		
		//Ejemplo 5
		System.out.println("5-------------------------");
		List<String> numbers = new ArrayList<>(30);
		numbers.add("1"); 						
		numbers.add("2"); 						
		
		System.out.println(numbers.isEmpty()); 		
		System.out.println(numbers.size()); 			
		
		numbers.clear(); 							
	
		System.out.println(numbers.isEmpty()); 		
		System.out.println(numbers.size());
		
		
		
		
		//Ejemplo 6
		System.out.println("6-------------------------");
		List<String> names = new ArrayList<>();
		names.add("luis"); 	names.add("pedro");
		System.out.println(names.contains("Luis"));
		System.out.println(names.contains("pedro")); 	
		
		
		
		
		//Ejemplo 7
		System.out.println("7-------------------------");
		List<String> one = new ArrayList<>(20);
		List<String> two = new ArrayList<>();
		
		System.out.println(one.equals(two));
		
		one.add("a"); 							
		two.add("a");
		
		System.out.println(one.equals(two));
		System.out.println(one == two); 	
	}
	
}
