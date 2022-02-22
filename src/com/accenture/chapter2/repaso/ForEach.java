package com.accenture.chapter2.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		List<String> numbers =  Arrays.asList("1", "2", "3", "4");
		for(int number : numbers) {
			System.out.println(number);
		}
		
		//Ejemplo 2
		List<String> names =  Arrays.asList("Luis", "Pedro", "Pablo");
		for(String name : names) {
			System.out.println(name);
		}
		
		//Ejemplo 3
		String[] names2 =  null;
		for(String name : names) {
			System.out.println(name);
		}	
		
		//Ejemplo 4 - NO lanza un NPE.
		String[] names3 =  {};
		//String[] names3 = new String[0];
		//List<String> names3 = new ArrayList<>();
		//List<String> names3 = Arrays.asList();
		for(String name : names3) {
			System.out.println(name);
		}
		
		//Ejemplo 5
		String[][] matrix = {{"1", "2"}, {"3", "4"}, {"5", "6"}};
		for(String number: matrix) {
			System.out.println(number.length());
		}
		
		//Ejemplo 6
		String names4 = null;
		for(String name : names4) {
			System.out.println(name));
		}
	}
	
}
