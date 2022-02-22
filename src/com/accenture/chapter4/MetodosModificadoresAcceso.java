package com.accenture.chapter4;

import java.io.IOException;

public class MetodosModificadoresAcceso {
	
	public static void main(String args[]) {
		
	}
	
	//Diferentes modificadores de acceso
	private void metodoA() {}	// Método privado, solo accesible desde la misma clase.
	
	void metodoB() { return; }	// Método default, solo accesible desde el mismo paquete.
	
	protected int metodoD(){ return 1; } // Método protected, accesible desde el mismo paquete y subclases.
	
	public int metodoC(){ return 1; } //Método public, accesible desde cualquier clase.
}
