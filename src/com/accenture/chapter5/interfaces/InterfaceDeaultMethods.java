package com.accenture.chapter5.interfaces;

public class InterfaceDeaultMethods {

}

//Ejemplo 1
interface IsWarmBlooded {
	boolean hasScales();

	public default double getTemperature() {
		return 10.0;
	}
}

//Ejemplo 2
interface Carnivore {
	public default void eatMeat(); // DOES NOT COMPILE

	public int getRequiredFoodAmount() { // DOES NOT COMPILE. Se tiene que marcar como default o static.
		return 13;
	}
}

//Ejemplo 3
interface HasFins {
	public default int getNumberOfFins() {
		return 4;
	}

	public default double getLongestFinLength() {
		return 20.0;
	}

	public default boolean doFinsHaveScales() {
		return true;
	}
}

interface SharkFamily extends HasFins {
	public default int getNumberOfFins() {
		return 8;
	}

	public double getLongestFinLength();

	public boolean doFinsHaveScales() { // DOES NOT COMPILE. Se tiene que marcar como default.
		return false;
	}
}

