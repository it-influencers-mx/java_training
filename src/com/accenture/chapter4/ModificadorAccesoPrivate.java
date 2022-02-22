package com.accenture.chapter4;

public class ModificadorAccesoPrivate {
	
	private int intPrivado;		//Miembro privado
	int intDefault;				//Miembro default
		
	private void metodoPrivado1() {
		System.out.println("Metodo Privado 1");
		
		metodoPrivado2();
		
		System.out.println("Campo privado: " + intPrivado);
		
		//Es posible acceder a los miembros privados a través de una referencia solo desde la misma clase.
		ModificadorAccesoPrivate modificadorAccesoPrivate = new ModificadorAccesoPrivate();
		System.out.println("Campo privado: " + modificadorAccesoPrivate.intPrivado); 
		modificadorAccesoPrivate.metodoPrivado2();
	}
	
	private void metodoPrivado2() {
		System.out.println("Metodo Privado 2");
		
		ClaseA a = new ClaseA();
		//System.out.println("Campo privado: " + a.intPrivadoClaseA); 		// No compila, el miembro privado no es accesible desde otra clase.
		//a.metodoPrivadoClaseA(); 											// No compila, el miembro privado no es accesible desde otra clase.
	}
	
}

class ClaseA {
	private int intPrivadoClaseA;
	
	private void metodoPrivadoClaseA() {
		System.out.println("Metodo Privado Clase A");
	}
}
