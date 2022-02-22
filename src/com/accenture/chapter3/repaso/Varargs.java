package com.accenture.chapter3.repaso;

import java.util.Arrays;
import java.util.function.Predicate;

public class Varargs {
	
	public static void main(String[] args) {
		
		//Ejemplo 1
		example1(1, "Juan", "Pedro", "Pablo");
		
		//Ejemplo 2
		example1(2);
		
		//Ejemplo 3
		//example1(3, null);
		
		//Ejemplo 4
		example1(4, new String[] {"Simon", "José", "Luis"});
		
		//Ejemplo 5
		example1(5, new String[2]);
		
		//Ejemplo 6
		//example1(6, { "Mario" });
		
	}
	
	private static void example1(int number, String... names) {
		System.out.println(names.length);

		for(String name : names) {
			System.out.println(name);
		}
	}
}
