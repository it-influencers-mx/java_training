package com.accenture.chapter5.interfaces;

public class InterfaceMultipleInheritance {

}

//Ejemplo 1
interface Herbivore {
	public void eatPlants();
}

interface Omnivore {
	public void eatPlants();

	public void eatMeat();
}

//Sobrescribe ambos métodos abstractos heredados.
class Bear implements Herbivore, Omnivore {
	public void eatMeat() {
		System.out.println("Eating meat");
	}

	public void eatPlants() {
		System.out.println("Eating plants");
	}
}

//Ejemplo 2
interface Herbivore2 {
	public int eatPlants(int quantity);
}

interface Omnivore2 {
	public void eatPlants();
}

//Dado que ambos métodos son distintos (Diferente firma), se tienen que implementar por separado.
class Bear2 implements Herbivore2, Omnivore2 {
	public int eatPlants(int quantity) {
		System.out.println("Eating plants: " + quantity);
		return quantity;
	}

	public void eatPlants() {
		System.out.println("Eating plants");
	}
}

//Ejemplo 3
interface Herbivore3 {
	public int eatPlants();
}

interface Omnivore3 {
	public void eatPlants();
}

// No compilará puesto que ambos métodos son iguales, pero tiene un tipo de retorno distinto.
// no hay manera de implementar ambas interfaces al mismo tiempo.
// Esto aplica para clases concretas, interfaces, clases abstractas que utilicen estas interfaces.
class Bear3 implements Herbivore3, Omnivor3 {
	public int eatPlants() { // DOES NOT COMPILE
		System.out.println("Eating plants: 10");
		return 10;
	}

	public void eatPlants() { // DOES NOT COMPILE
		System.out.println("Eating plants");
	}
}

interface Supervore extends Herbivore3, Omnivore3 {} // DOES NOT COMPILE
abstract class AbstractBear implements Herbivore3, Omnivore3 {} // DOES NOT COMPILE
