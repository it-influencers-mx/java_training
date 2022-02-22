package com.accenture.chapter5.interfaces;

public class InterfaceDefaultMethodsMultipleInheritance {

}

//Ejemplo 1
interface Walk {
	public default int getSpeed() {
		return 5;
	}
}

interface Run {
	public default int getSpeed() {
		return 10;
	}
}

// El método heredado getSpeed es ambiguo.
class Cat implements Walk, Run { // DOES NOT COMPILE
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
}

class CatCorrect implements Walk, Run { // DOES NOT COMPILE
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}

	public int getSpeed() {
		return 1;
	}
}