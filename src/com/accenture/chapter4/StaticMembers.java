package com.accenture.chapter4;

public class StaticMembers {
	private static int contador;
	
	private static void staticMethod() {}
	
	public static void main(String args[]) {
		
		//Ejemplo 1 
		StaticMembers staticMembers = new StaticMembers();
		System.out.println(staticMembers.contador);	// 0
		staticMembers = null;
		System.out.println(staticMembers.contador); // 0 . No lanza un NPE dado que Java revisa el tipo de la ref, en vez del objeto para llamar acceder al miembro estático.
		System.out.println(StaticMembers.contador); // 0
	
	
		//Ejemplo 2 
		StaticMembers.contador = 4;
		StaticMembers staticMembers2 = new StaticMembers();
		StaticMembers staticMembers3 = new StaticMembers();
		staticMembers2.contador = 6;
		staticMembers3.contador = 5;
		System.out.println(StaticMembers.contador); // 5 . Dado que la variable es compartida entre todas las instancias, la modificación de esta se ve reflejada en todas.
	}
}
