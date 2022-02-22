package com.accenture.chapter1.repaso;

public class Constructores {
	Constructores(){}
}

class Constructores2 {
	public void Constructores2(){}
}

class Constructores3 {
	private int Constructores3(){ return 0;}
}

class Constructores4 {
	private Constructores4(){ }
}

class Constructores5 {
	//public constructores5(){ } //No compila. No es un constructor puesto que el nombre no coincide con el de la clase.
	public void Constructores5(){ }
}

class Constructores6 {} //El compilador automáticamente inserta un constructor default vacío.

