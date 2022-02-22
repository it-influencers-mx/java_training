package com.accenture.chapter4;

import java.io.IOException;

public class MetodosModificadoresAcceso {
	
	public static void main(String args[]) {
		
	}
	
	//Diferentes modificadores de acceso
	private void metodoA() {}	// M�todo privado, solo accesible desde la misma clase.
	
	void metodoB() { return; }	// M�todo default, solo accesible desde el mismo paquete.
	
	protected int metodoD(){ return 1; } // M�todo protected, accesible desde el mismo paquete y subclases.
	
	public int metodoC(){ return 1; } //M�todo public, accesible desde cualquier clase.
}
