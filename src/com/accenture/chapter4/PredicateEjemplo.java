package com.accenture.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEjemplo {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));	
		
		//Utilizando Predicate
		print(animals, a -> a.canHop());
		
		//Es posible almacenarlo primero en una variable y luego enviarlo como parámetro.
		Predicate<Animal> checker = a -> a.canHop();
		print(animals, checker);
		
		
		//RemoveIfExample
		removeIfExample();
	}

	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
	
	private static void removeIfExample() {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies); // [long ear, floppy, hoppy]
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies); // [hoppy]
	}
	
}
