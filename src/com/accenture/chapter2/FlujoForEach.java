package com.accenture.chapter2;

import java.util.ArrayList;
import java.util.List;

public class FlujoForEach {
	public static void main(String args[]) {
		List<Integer> listaIntegers = new ArrayList<>();
		listaIntegers.add(null);
		listaIntegers.add(null);
		listaIntegers.add(1);
		
		//Ejemplo 1
		for(Integer num : listaIntegers) {
			System.out.print(num + " "); // Compila, Imprime null null 1
		}
		
		//Ejemplo 2
		for(Integer num : listaIntegers) {
			 int x = num; // NullPointerException al momento de hacer unboxing. Clases wrapper se verán en Capitulo 3. 
		}
		
		//Ejemplo 3
		List<String> listaCadenas =  null;
		for(String cadena : listaCadenas) { //NullPointerException
			System.out.print(cadena); 
		}
		
		//Ejemplo 4
		for(int num : listaIntegers) { //NullPointerException
			
		}
		
		//Ejemplo 5
		String names = "Juan Pedro Pablo";
		for(String name : names) { // No compila, no es un arreglo u objeto que implemente Iterable
			System.out.print(name); 
		}
		
		//Ejemplo 6
		int[] arreglo = new int[] {1,2,3};
		for(String num : arreglo) { // No compila, no son del mismo tipo de dato.
			
		}
		
		//Ejemplo 7
		List<String> lista = new ArrayList<>();
		lista.add("a");
		lista.add("b");
		
		for(String cadena : lista) {
			System.out.print(cadena); 
		}
		cadena = "Otra cadena"; // No compila, cadena esta fuera del scope.
		
	
		//Ejemplo 8
		//Podemos declarar una variable del tipo de dato que sea compatible con el array/collection que estemos iterando.
		String[] arregloString = new String[10];
		for(Object x : arregloString) { 
			
		}
		
		//Ejemplo 9
		Object[] arregloObject = new Object[10];
		for(String x  : arregloObject) { // No compila, no podemos asignar un supertipo a un subtipo.
			
		}
	}
}
