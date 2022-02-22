package com.accenture.chapter2;

public class BreakAndContinue {
	public static void main(String args[]) {
		int x = 0;

		//Ejemplo 1
		EXTERNO: for (int i = 0; i < 10; i++) {

			if (i == 2) {
				 // continue INTERNO; //No compila, INTERNO no existe aún en este punto.
			}

			INTERNO: for (int j = 0; j < 10; j++) {

				if (j == 2) {
					continue EXTERNO;
				}
			}
		}

		//Ejemplo 2
		EXTERNO: while (x == 1) {
			continue EXTERNO;
		}
		
		//Ejemplo 3
		breakExample();
		
		//Ejemplo 4
		continueExample();
		
		//Ejemplo 5 (Fuera del scope del examen)
		labelTest();
	}

	private static void breakExample() {
		int[][] list = { { 1, 13, 5 }, { 1, 2, 5 }, { 2, 7, 2 } };
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;

		PARENT_LOOP: for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
				    //break PARENT_LOOP; // [1, 1]
					//break; 			  // [2, 0]
					// Sin break 		  // [2, 2]
				}
			}
		}

		if (positionX == -1 || positionY == -1) {
			System.out.println("Value " + searchValue + " not found");
		} else {
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}
	}
	
	/** Imprime "1a 3a 4a" */
	private static void continueExample() { 
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}
	}
	
	// ** Fuera del scope del examen, break y labels pueden utilizarse en otros bloques de código además de ciclos. 
	private static void labelTest() {
		int x = 0;
		int y = 0;
		IF_LABEL :if(x == 0) {
			
		} else {
			
			if(y == 1) {
				break IF_LABEL;
			}
			
			PRINT: System.out.println("Else");
		}
		
		BLOQUE : {
			System.out.println("Bloque de código");
			
			if(y == 1) {
				break BLOQUE;
			}
		}
	}
}
