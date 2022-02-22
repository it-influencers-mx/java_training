package com.accenture.chapter4;

import java.util.ArrayList;
import java.util.List;

//Ejemplo 1
public class MetodosPasandoInformacion {
	public static void main(String[] args) {
		int num = 4;
		newNumber(5);
		System.out.println(num); // 4
	}

	public static void newNumber(int num) {
		num = 8; // Esto solo afecta la asignación local de esta variable.
	}
}

//Ejemplo 2
class MetodosPasandoInformacionA {
	public static void main(String[] args) {
		String name = "Webby";
		speak(name);
		System.out.println(name); // Webby
	}

	public static void speak(String name) {
		name = "Sparky";
	}
}

//Ejemplo 3
class MetodosPasandoInformacionB {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		speak(name);
		System.out.println(name); // Webby
	}

	public static void speak(StringBuilder s) {
		s.append("Webby"); // No se reasigna la referencia, pero el método afecta al objeto al cual apuntan
							// ambas variables.
	}
}

//Ejemplo 4
class MetodosPasandoInformacionC {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("1");
		modifyList(lista);
		System.out.println(lista); // [1, 2]
	}

	public static void modifyList(List<String> l) {
		l.add("2"); 			// No se reasigna la referencia, pero el método afecta al objeto al cual apuntan
								// ambas variables.
		l = new ArrayList<>(); 	//Solo reasignamos la referencia, pero el original no se modifica.
		l.add("3");
	}
}

//Ejemplo 5
class MetodosPasandoInformacionD {
	public static void main(String[] args) {
		int number = 1; 						// 1
		String letters = "abc"; 				// abc
		number(number); 						// 1 . El resultado del método se pierde puesto que no se reasigna.
		letters = letters(letters); 			// abcd
		System.out.println(number + letters); 	// 1abcd
	}

	public static int number(int number) {
		number++;
		return number;
	}

	public static String letters(String letters) {
		letters += "d";
		return letters;
	}
}
