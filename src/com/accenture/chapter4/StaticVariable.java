package com.accenture.chapter4;

import java.util.ArrayList;

public class StaticVariable {
	private static final int NUM_BUCKETS = 45;
	private static final ArrayList<String> values = new ArrayList<>();

	public static void main(String[] args) {
		// NUM_BUCKETS = 5; 			// DOES NOT COMPILE. Esta declarada como final.
		
		values.add("changed"); 			// Si compila, podemos mandar llamar métodos del objeto, pero no podemos reasignar la variable hacia otra referencia.
		//values = new ArrayList<>();	// No compila.
	}
}
