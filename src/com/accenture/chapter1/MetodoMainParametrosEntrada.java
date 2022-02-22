package com.accenture.chapter1;

public class MetodoMainParametrosEntrada {
	
	public static final void main(String args[]) {
		//1. args Nunca es nulo, si no enviamos par�metros de entrada el arreglo es creado como un arreglo vac�o.
		//2. Los par�metros que enviemos empezaran en la posici�n 0 de nuestro arreglo.
		//3. Los par�metros que recibamos son almacenados como Strings en nuestro arreglo, si ocupamos el par�metro como un
		//	 tipo de dato distinto (num�rico, por ejemplo) tendr�amos que realizar una conversi�n expl�cita del String.	
		
		if(args.length >= 2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}
	}
	
	//Mismo ejemplo, pero utilizando varargs en vez de String[]
	/*public static void main(String... args) {
		if(args.length >= 2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
		}
	}*/
	
}

