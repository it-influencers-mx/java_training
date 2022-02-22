package com.accenture.chapter4;

import com.accenture.chapter4.a.ModificadorDefaultA;

public class ModificadorAccesoDefault {
	
	int intDefault;

	void metodoDefault1() {
		System.out.println("Metodo Default 1");
		
		//Miembros default
		metodoDefault2();
		System.out.println("Campo default: " + intDefault);
		
		//Miembros default utilizando una referencia.
		ModificadorAccesoDefault modificadorAccesoDefault = new ModificadorAccesoDefault();
		System.out.println("Campo default: " + modificadorAccesoDefault.intDefault); 
		modificadorAccesoDefault.metodoDefault2();
		
		//Accediendo a miembros default de otras clases en el mismo package.
		ModificadorAccesoPrivate m = new ModificadorAccesoPrivate();
		System.out.println("Campo default: " + m.intDefault);
		
		
		//Accediendo a miembros default de otras clases en diferentes packages.
		ModificadorDefaultA md = new ModificadorDefaultA();
		//System.out.println("Campo default: " + md.intDefault);   	//No compila, los miembros default solo son accesibles desde el mismo package.
		//md.metodoDefault();										//No compila, los miembros default solo son accesibles desde el mismo package.
	}
	
	void metodoDefault2() {
		System.out.println("Metodo Default 2");
		ClaseB b = new ClaseB();
		System.out.println("Campo default: " + b.intDefaultClaseB); 		// Si compila, el miembro default es accesible desde otra clase del mismo package.
		b.metodoDefaultClaseB(); 											// Si compila, el miembro default es accesible desde otra clase del mismo package.
	}
	
}

class ClaseB {
	int intDefaultClaseB;
	
	void metodoDefaultClaseB() {
		System.out.println("Metodo Privado Clase A");
	}
}
