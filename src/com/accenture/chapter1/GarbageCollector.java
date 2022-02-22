package com.accenture.chapter1;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector {
	
	private static List<Object> lista = new ArrayList<>();
	
	public void referenceTest() {
		Object object1 = new Object();
		Object object2 = new Object();
		Object object3;
		
		object1 = null; // El objeto creado en la primer l�nea se vuelve candidato a ser gb.
		object3 = object2;
		
		// El objeto creado en la segunda l�nea NO se vuelve candidato a�n a ser gb, puesto que object 3 todav�a apunta hacia �l.
		object2 = null; 
		
	} // El objeto creado en la segunda l�nea se vuelve candidato a ser gb, puesto que la �ltima referencia que apuntaba hacia �l a quedado fuera de scope.

	
	public static void main(String[] args) {
		new GarbageCollector().referenceTest();
	}
	
	@Override
	public void finalize() { // Se ejecuta a lo mucho 1 vez.
		System.out.println("Dentro de finalize");
		lista.add(this); // El objeto deja de ser elegible para ser gb.
	}
}
