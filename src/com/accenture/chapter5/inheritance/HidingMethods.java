package com.accenture.chapter5.inheritance;

public class HidingMethods {

}

//Ejemplo 1
class Bear {
	public static void eat() {
		System.out.println("Bear is eating");
	}
}

class Panda extends Bear {
	public static void eat() {
		System.out.println("Panda bear is chewing");
	}

	public static void main(String[] args) {
		Panda.eat();
	}
}

//Ejemplo 2
public class Bear2 {
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}

	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

public class Panda2 extends Bear2 {
	public void sneeze() { // DOES NOT COMPILE
		System.out.println("Panda bear sneezes quietly");
	}

	public static void hibernate() { // DOES NOT COMPILE
		System.out.println("Panda bear is going to sleep");
	}
}