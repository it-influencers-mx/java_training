package com.accenture.chapter3;

import java.util.Arrays;
import java.util.function.Predicate;

public class Varargs {
	
	public static void main(String[] args) {
		
		//Ejemplo 1
		example1(1, "Juan", "Pedro", "Pablo");
		
		example1(2); //Es posible omitir el parámetro y no enviar nada. 
					 //En dicho caso el parámetro dentro del método es tomado como un arreglo vacío NO como null.
		
		//example1(3, null); //NullPointerException.
		
		example1(4, new String[] {"Simon", "José", "Luis"});
		
		//example1(5, {"Simon", "José", "Luis"}); //No compila, esta manera de crear un arreglo solo es valida 
												//cuando se inicializa un arreglo al momento de que se declara.
	}
	
	private static void example1(int number, String... names) {
		System.out.println(names.length);
		System.out.println(names.length > 1 ? names[0] : "");
		Arrays.sort(names);
		
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	private static void example2(int number, String... names) {
	
	}
	
	private static void example3(int number, String ...names) {
		
	}
	
	private static void example4(int number, String... names) {
		
	}
	
	//private static void example5(int number, String names...) { //No compila, los 3 puntos deben ir antes del nommbre de la variable.
		
	//}
}
