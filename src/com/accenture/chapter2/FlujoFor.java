package com.accenture.chapter2;

public class FlujoFor {
	public static void main(String args[]) {
		
		//for(;;); // Ciclo inifinito vacío.
		
		//for(;;) // Ciclo inifinito
		//	System.out.println("Dentro del for"); 
		
		// for(int z = 0, int x = 1;z < 10; z++) {} //No compila. No se pueden declarar más de dos tipos.
		
		int i = 0;
		//for(int x = 0, i = 0; i < 10; i++) {} // No compila, la variable i ya estaba declarada.
		
		for(i = 1; i < 10; i++) {}  // Ciclo for vacío.
		
		for(i = 1; i < 10; i++);	// Ciclo for vacío.
		
		for(int j = 0; j < 10; j++)
			System.out.println("Dentro del for");
		//	System.out.println(j); // No compila, no pertenece al for, por lo tanto la variable j no está en scope. 
		
		for(int x = 0; x < 10; x++)
			for(int j = 0; j < 10; j++)
				for(int z = 0; z < 10; z++)
					System.out.print(x + j + z);
		
		int nn = 0;
		int mm = 0;
		int hk = 0;
		for(
				System.out.println(mm++), returnAnInt(), mm = 1 ; 						//Inicializacion
				mm < 10; 																//Condicion
				System.out.println(mm++), returnAnInt(), hk = returnAnInt(), nn += mm 	//Actualizacion		
			)
		{
			System.out.println(hk);
		}
	}
	
	private static int returnAnInt() {
		return 1;
	}
}
