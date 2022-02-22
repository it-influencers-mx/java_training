package com.accenture.chapter5.interfaces;

public class InterfaceCreation {
	public static void main(String[] args) {
		WalksOnTwoLegs example = new WalksOnTwoLegs(); // DOES NOT COMPILE . No se puede instanciar una interfaz
														// directamente
	}
}

//Ejemplo 1
interface WalksOnTwoLegs {
}

//Equivalente a la anterior, el compilador inserta automáticamente el modificador abstract en caso de que no lo escribamos explícitamente.
abstract interface WalksOnTwoLegs2 {
} 

//Una interfaz no puede ser final.
final interface WalksOnTwoLegs3 {
} 



//Ejemplo 2 - Los ejemplos son equivalentes. Java inserta los modificadores public, abstract en caso de que no los agreguemos explícitamente
interface CanFly {
	void fly(int speed);
	abstract void takeoff();
	public abstract double dive();
}

abstract interface CanFly2 {
	public abstract void fly(int speed);
	public abstract void takeoff();
	public abstract double dive();
}


//Ejemplo 3 - Los modificadores final y private y protected NO son compatibles con los métodos de la interfaz.
private final interface CanCrawl { 		// DOES NOT COMPILE
	private void dig(int depth); 		// DOES NOT COMPILE
	protected abstract double depth(); 	// DOES NOT COMPILE
	public final void surface();		// DOES NOT COMPILE
}