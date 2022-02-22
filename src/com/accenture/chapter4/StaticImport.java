package com.accenture.chapter4;

import static com.accenture.chapter4.StaticImportA.testIntField;	//Si compila
import static com.accenture.chapter4.StaticImportB.testIntField;	//Si compila
import static java.util.Arrays.asList; // static import
//import java.util.Arrays;
import java.util.List;
//static import java.util.Arrays.*; // DOES NOT COMPILE. Debe ser import static en ese orden.
//import static java.util.Arrays; 	// DOES NOT COMPILE. No podemos realizar imports estáticos de clases.

public class StaticImport {
	
	//private static int testIntField;
	
	public static void main(String args[]) {
		//System.out.println(testIntField); //No compila
		
		List<String> list = asList("one", "two"); 	// no Arrays.
		//Arrays.asList("one"); 					// DOES NOT COMPILE. No estamos importando la clase Arrays.
	}
}
