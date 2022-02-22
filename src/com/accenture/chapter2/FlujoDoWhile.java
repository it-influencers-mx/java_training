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
		
		
		/// No me toc� ver un ejemplo similar, simplemente saber que sucede en estos escenarios.
		do {
			System.out.println(x1);
		} while(true); // Ciclo infinito
		
		//Si ponemos c�digo despu�s de este �ltim do-while el compilador detecta unreachable code y no compila
		//Se podr�a arreglar agregando un break al ciclo.
		
		// System.out.println(x1);
	}
}
