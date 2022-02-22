package com.accenture.chapter1;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector {
	
	private static List<Object> lista = new ArrayList<>();
	
	public void referenceTest() {
		Object object1 = new Object();
		Object object2 = new Object();
		Object object3;
		
		object1 = null; // El objeto creado en la primer línea se vuelve candidato a ser gb.
		object3 = object2;
		
		// El objeto creado en la segunda línea NO se vuelve candidato aún a ser gb, puesto que object 3 todavía apunta hacia él.
		object2 = null; 
		
	} // El objeto creado en la segunda línea se vuelve candidato a ser gb, puesto que la última referencia que apuntaba hacia él a quedado fuera de scope.

	
	public static void main(String[] args) {
		new GarbageCollector().referenceTest();
	}
	
	@Override
	public void finalize() { // Se ejecuta a lo mucho 1 vez.
		System.out.println("Dentro de finalize");
		lista.add(this); // El objeto deja de ser elegible para ser gb.
	}
}
