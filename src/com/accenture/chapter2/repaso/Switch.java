package com.accenture.chapter2.repaso;

import java.time.DayOfWeek;

public class Switch {

	public static void main(String args[]) {

		// Ejemplo 1
		/*int x = 1;
		switch (x) {
			default: System.out.println("Default"); break;
			case 1:
				System.out.println("1");
				System.out.println("1");
			case 2:
				System.out.println("2"); break;
			case 3:
				System.out.println("3");
		}

		// Ejemplo 2
		String s = "hola";
		final String hola = "hola";
		switch (s) {
			default:
				System.out.println("Default");
				break;
			case "Hola":
				System.out.println("hola 1");
				break;
			case "hola":
				System.out.println("hola 2");
				break;
			case hola:
				System.out.println("hola 3");
		}
		
		// Ejemplo 3
		DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
		switch (dayOfWeek) {
			
			case TUESDAY:
				System.out.println("TUESDAY");
				break;
			default:
				System.out.println("Default");
				break;
			case MONDAY:
				System.out.println("MONDAY");
				break;
			case "FRIDAY":
				System.out.println("FRIDAY");
		}*/
		
		// Ejemplo 4
		long x1 = 1;
		switch ( x1) {
			default: System.out.println("Default"); break;
			case 1:
				System.out.println("1");
				System.out.println("1");
			case 2:
				System.out.println("2"); break;
			case 3:
				System.out.println("3");
		}
	}

}
