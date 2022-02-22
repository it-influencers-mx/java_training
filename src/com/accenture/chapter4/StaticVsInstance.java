package com.accenture.chapter4;

//Ejemplo 1
public class StaticVsInstance {
	private String name = "Static class";

	public static void first() {
	}

	public static void second() {
	}

	public void third() {
		System.out.println(name);
	}

	public static void main(String args[]) {
		first();
		second();
		// third(); // DOES NOT COMPILE
	}
}

//Ejemplo 2
class Gorilla {
	public static int count;

	public static void addGorilla() {
		count++;
	}

	public void babyGorilla() {
		count++;
	}

	public void announceBabies() {
		addGorilla();
		babyGorilla();
	}

	public static void announceBabiesToEveryone() {
		addGorilla();
		// babyGorilla(); // DOES NOT COMPILE
	}

	public int total;

	// public static average = total / count; // DOES NOT COMPILE
}


//Ejemplo 3 - Contador
class Counter {
	private static int count;

	public Counter() {
		count++;
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		System.out.println(count); // 3
	}
}
