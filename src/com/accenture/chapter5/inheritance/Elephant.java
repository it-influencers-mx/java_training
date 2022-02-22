package com.accenture.chapter5.inheritance;

public class Elephant extends Mammal {
	// Si no especificamos explícitamente una llamada al constructor de Mammal, la
	// clase no compilará,
	// puesto que Mammal no tiene un constructor sin parámetros.

	public Elephant() {
		super(10);
	}
	
	/*public Elephant(int x) {
		
	}*/
}
