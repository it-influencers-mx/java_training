package com.accenture.chapter3;

import java.time.LocalDate;

public class StringConcateancion {
	public static void main(String[] args) {
        
		//Ejemplo 1 - Aplicación de todas las reglas
        int tres = 3;
        String cuatro = "4";
        System.out.println(1 + 2 + tres + cuatro); // 64

        // Ejemplo 2  +=
        String s = "1"; // s -> "1"
        s += "2"; 		// s -> "12"
        // s = s + "2"; // Equivalente a la sentencia anterior.
        s += 3; 		// s -> "123"
        System.out.println(s); // 123

        //Ejemplo 3
        String a = null;
        System.out.println(a + 3); //Imprime null3
        System.out.println(String.valueOf(a) + String.valueOf(3)); //Imprime null3
        
        //Ejemplo 4
        //System.out.println(null); //No compila, es ambiguo cual sobrecarga elegir y por ello no compila.
        String str = null;
        System.out.println(str); //Imprime null.
        
        //Ejemplo 5
        Object obj = new Object();
        LocalDate ld = LocalDate.now();
        System.out.println("" + obj + ld);
        //System.out.println(obj + ld + ""); // No compila, no se puede utilizar el operador de + de esta manera.
        
    }
}
