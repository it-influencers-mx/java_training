package com.accenture.chapter2;

public class FlujoDoWhile {
	public static void main(String[] args) {
		int x1 = 1;
		
		do 
			System.out.println(x1);
		while(x1 > 10);
		
		do System.out.println(x1); while(x1 > 10);
		
		do {
			System.out.println(x1);
		} while(x1 > 10);
		
		do
			//System.out.println(x1); //No compila
			System.out.println(x1);
		while(x1 > 10);
		
		do {
			System.out.println(x1);
			System.out.println(x1);
		} while(x1 > 10);
		
		do {
			System.out.println(x1);
		} while(false); 
		
		
		/// No me tocó ver un ejemplo similar, simplemente saber que sucede en estos escenarios.
		do {
			System.out.println(x1);
		} while(true); // Ciclo infinito
		
		//Si ponemos código después de este últim do-while el compilador detecta unreachable code y no compila
		//Se podría arreglar agregando un break al ciclo.
		
		// System.out.println(x1);
	}
}
