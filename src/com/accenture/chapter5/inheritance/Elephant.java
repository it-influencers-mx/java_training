package com.accenture.chapter5.inheritance;

public class Elephant extends Mammal {
	// Si no especificamos expl�citamente una llamada al constructor de Mammal, la
	// clase no compilar�,
	// puesto que Mammal no tiene un constructor sin par�metros.

	public Elephant() {
		super(10);
	}
	
	/*public Elephant(int x) {
		
	}*/
}
