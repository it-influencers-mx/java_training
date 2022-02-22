package com.accenture.chapter4;

public class StaticInitialization {
	//Ejemplo 1
	private static final int NUM_SECONDS_PER_HOUR;
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}

	//Ejemplo 2
	private static int one;
	private static final int two;
	private static final int three = 3;
	//private static final int four; // DOES NOT COMPILE. No se asigna su valor explícitamente en ninguna parte.
	static {
		one = 1;
		two = 2;
		//three = 3; 	// DOES NOT COMPILE. No se puede reasignar el valor dado que es final.
		//two = 4; 		// DOES NOT COMPILE. No se puede reasignar el valor dado que es final.
	}
}
