package com.accenture.chapter2;

public class EstructuraIf {
	public static void main (String args[]) {
		int o = 1;
		
		//Escenario 1
		if(o == 1) {
			 System.out.println("o = 1");
		}
		
		//Escenario 2
		if(o == 1) 
			 System.out.println("o = 1");
		
		//Escenario 3
		if(o == 1) System.out.println("o = 1");
		
		
		//Escenario 4
		if(o != 1) System.out.println("o != 1"); System.out.println("Dos"); //El segundo print se ejecuta siempre.
		
		//Escenario 5
		if(o != 1) 
			System.out.println("o != 1"); 
			System.out.println("Dos"); // Esta línea se ejecuta siempre, no importando si se cumple o no la condicion.
		
		
		//Escenario 6. Si compila. https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.21
		//Al compilarse este código se excluye del bytecode.
		if(false) {
			System.out.println("Nunca se cumple la condición"); 
		}
		
		while(false) {}					//No compila. Unreacheable code.
		for(int p = 0; false; p++) {}	//No compila. Unreacheable code.
	}
}
