package com.accenture.chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMetodos {
	
	public static void main(String args[]) {
		
		//Ejemplo 1.a - add() - sin generics
		System.out.println("1.a-------------------------");
		ArrayList list = new ArrayList();
		list.add("hawk"); 			// [hawk]
		list.add(Boolean.TRUE); 	// [hawk, true]
		System.out.println(list); 	// [hawk, true] -> El método toString() está sobreescrito en la clase ArrayList.
	
		
		//Ejemplo 1.b - add() - con generics
		System.out.println("1.b-------------------------");
		ArrayList<String> safer = new ArrayList<>();
		safer.add("sparrow");
		//safer.add(Boolean.TRUE); // No compila, el tipo de dato es incorrecto.
		safer.add(Boolean.TRUE.toString());
		
		
		//Ejemplo 1.c - add() - distintos índices
		System.out.println("1.c-------------------------");
		List<String> birds = new ArrayList<>();
		birds.add("hawk");			// [hawk]
		birds.add(1, "robin"); 		// [hawk, robin]
		birds.add(0, "blue jay"); 	// [blue jay, hawk, robin]
		birds.add(1, "cardinal"); 	// [blue jay, cardinal, hawk, robin]
		System.out.println(birds); 	// [blue jay, cardinal, hawk, robin]
		
		
		//** El método add en ArrayList siempre devuelve true.
		
		
		
		
		//Ejemplo 2 - remove()
		System.out.println("2-------------------------");
		List<String> birdsA = new ArrayList<>();
		birdsA.add("hawk"); 								// [hawk]
		birdsA.add("hawk"); 								// [hawk, hawk]
		System.out.println(birdsA.remove("cardinal")); 		// false
		System.out.println(birdsA.remove("hawk")); 			// true
		System.out.println(birdsA.remove(0)); 				// hawk
		System.out.println(birdsA); 						// []
		System.out.println(birdsA.remove("cardinal")); 		// false
		//System.out.println(birdsA.remove(0)); 			// IndexOutOfBoundsException
		
		//Ejemplo 2.a - remove() - Integer vs int
		System.out.println("2.a-------------------------");
		List<Integer> nums = new ArrayList<>();
		nums.add(new Integer(1));
		nums.add(2);
		nums.add(3);
		nums.add(4);
		System.out.println(nums.remove(1)); 				//Remueve el index 1, imprime 2
		System.out.println(nums.remove(new Integer(4)));	//Remueve el objeto Integer con valor 4, imprime true.
		
		
		
		
		//Ejemplo 3 - set()
		System.out.println("3-------------------------");
		List<String> birdsB = new ArrayList<>();
		birdsB.add("hawk"); 					// [hawk]
		System.out.println(birdsB.size()); 		// 1
		birdsB.set(0, "robin"); 				// [robin]
		System.out.println(birdsB.size()); 		// 1
		//birdsB.set(1, "robin"); 				// IndexOutOfBoundsException
		
		
		
		
		//Ejemplo 4 - isEmpty() and size()
		System.out.println("4-------------------------");
		List<String> birdsC = new ArrayList<>();
		System.out.println(birdsC.isEmpty()); 	// true
		System.out.println(birdsC.size()); 		// 0
		birdsC.add("hawk"); 						// [hawk]
		birdsC.add("hawk"); 						// [hawk, hawk]
		System.out.println(birdsC);					// [hawk, hawk]
		System.out.println(birdsC.isEmpty()); 	// false
		System.out.println(birdsC.size()); 		// 2
		
		List<String> birdsD = new ArrayList<>(20);
		System.out.println(birdsD.isEmpty()); 	// true
		System.out.println(birdsD.size()); 		// 0
		birdsD.add(null); 						// [null]
		birdsD.add(null); 						// [null, null]
		System.out.println(birdsD); 			// [null, null]
		
		
		
		
		//Ejemplo 5 - clear()
		System.out.println("5-------------------------");
		List<String> birdsE = new ArrayList<>();
		birdsE.add("hawk"); 						// [hawk]
		birdsE.add("hawk"); 						// [hawk, hawk]
		System.out.println(birdsE.isEmpty()); 		// false
		System.out.println(birdsE.size()); 			// 2
		birdsE.clear(); 							// []
		System.out.println(birdsE.isEmpty()); 		// true
		System.out.println(birdsE.size()); 			// 0
		
		
		
		
		//Ejemplo 6 - contains()
		System.out.println("6-------------------------");
		List<String> birdsF = new ArrayList<>();
		birdsF.add("hawk"); 							// [hawk]
		System.out.println(birdsF.contains("hawk")); 	// true
		System.out.println(birdsF.contains("robin")); 	// false
		
		List<StringBuilder> birdsG = new ArrayList<>();						//StringBuilder no sobreescribe el método equals.
		birdsG.add(new StringBuilder("hawk")); 								// [hawk]
		System.out.println(birdsG.contains(new StringBuilder("hawk"))); 	// false
		System.out.println(birdsG.contains(new StringBuilder("robin"))); 	// false
		
		
		
		
		//Ejemplo 7 - equals()
		System.out.println("7-------------------------");
		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();
		System.out.println(one.equals(two)); 	// true
		one.add("a"); 							// [a]
		System.out.println(one.equals(two)); 	// false
		two.add("a"); 							// [a]
		System.out.println(one.equals(two)); 	// true
		one.add("b"); 							// [a,b]
		two.add(0, "b"); 						// [b,a]
		System.out.println(one.equals(two)); 	// false
	}
	
}
