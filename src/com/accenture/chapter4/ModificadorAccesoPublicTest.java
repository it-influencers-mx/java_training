package com.accenture.chapter4;

public class ModificadorAccesoPublicTest {
	public static void main(String args[]) {
		
		//Llamando a miembros públicos de otra clase.
		ModificadorAccesoPublic m = new ModificadorAccesoPublic();
		
		int test = m.publicInt;
		
		m.publicMethod();
	}
	
}
