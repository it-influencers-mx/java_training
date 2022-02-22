package com.accenture.chapter4;

import java.util.ArrayList;
import java.util.List;


public class LambdaEjemplo {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		//Sin lambdas
		print(animals, new CheckIfHopper()); // pass class that does check
		print(animals, new CheckIfSwimmer()); // pass class that does check
		
		
		//Con lambdas
		print(animals, a -> a.canHop());
		print(animals, a -> a.canSwim());
		
		//No compilan
		//print(animals, a -> { a.canSwim(); }); 			// No compila, le falta el return.
		//print(animals, Animal a -> a.canSwim()); 			// No compila, le faltan los paréntesis.
		//print(animals, a -> { return a.canSwim() }); 		// No compila, le faltan el ; al final de la sentencia.
		//print(animals, a -> { int a = 0; return a.canSwim(); }); 	// No compila, no es posible redeclarar a;
		//print(animals, a -> { a = new Animal("", false, false); return a.canSwim(); }); 	//Si compila, solo estoy reasignando.
		//print(animals, a -> { String animals; return a.canSwim(); }); 	//No compila, ya existe una variable animals.
		
		//Con lambdas - Equivalentes a la sentencia anterior.
		print(animals, a -> { 
			
			for(int i = 0; i < 10; i++){
				
			}
			
			return a.canHop(); 
		
		});
		print(animals, (Animal a) -> { return a.canHop(); });
		print(animals, (Animal a) -> a.canHop());
		CheckTrait checker = a -> a.canHop();
		print(animals, checker);
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
}

//////Interfaz y clases que implementan la interfaz.

interface CheckTrait {
	boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}

class CheckIfSwimmer implements CheckTrait {
	public boolean test(Animal a) {
		return a.canSwim();
	}
}
