package com.accenture.chapter2;

public class EstructuraIfElse {
	public static void main(String[] args) {
		int p = 1;
		
		//Escenario 1
		if(p == 1) {
			System.out.println("p == 1"); 
		} else {
			System.out.println("p != 1");
		}
		
		//Escenario 2
		if(p == 1) 
			System.out.println("p == 1"); 
		else
			System.out.println("p != 1");
		
		//Escenario 3
		if(p == 1) System.out.println("p == 1"); 
		else System.out.println("p != 1");
		
		//Escenario 4
		if(p == 1) System.out.println("p == 1"); 
		else if(p == 2) System.out.println("p == 2");
		else System.out.println("p != 1 && p != 2");
		
		//Escenario 5
		if(p == 1) System.out.println("p == 1"); 
		else System.out.println("p == 2");
		//else System.out.println("p != 1 && p != 2"); // No compila, cada else tiene que tener su correspondiente if.
		
		//Escenario 6
		if(p == 1) System.out.println("p == 1"); 
		else 
			System.out.println("p != 1");
		System.out.println("Dentro del else"); // Esta línea no está ligada de ninguna manera al else.
			
		//Escenario 7
		if(p == 1) 
			System.out.println("p == 1");
			//System.out.println("Dentro del if"); 
		else //No compila
			System.out.println("p != 1"); 
		
		////// Prestar atención a expresiones que no evaluan a valores booleanos
		int m = 1;
		boolean n = false;
		
		//if(m) {}  //No compila
		//if(m = 1) {} // No compila, está asignando no comparando
		if(m == 1) {} //Compila
		if(n = true) {} // Compila y siempre entra, puesto que asigna el valor true a la variable, no la compara.
		
		
		if(true) 
			System.out.println("if");  
		else 
			System.out.println("else"); 
		
		if(false) 
			System.out.println("if");  
		else 
			System.out.println("else");
		
		//Else if con varios else 
		int hourOfDay = 5;
		
		if(hourOfDay < 12) {
			System.out.println("Buenos días");
		} else if(hourOfDay < 9) {
			System.out.println("Nunca se ejecuta");
		} else {
			System.out.println("Buenas tardes");
		}
		
		//Mismo ejemplo sin llaves
		if(hourOfDay < 12)
			System.out.println("Buenos días");
		else 
			if(hourOfDay < 9) System.out.println("Nunca se ejecuta");
			else  System.out.println("Buenas tardes");
	}
}
