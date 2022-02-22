package com.accenture.chapter1;

public class MetodoMainParametrosEntrada {
	
	public static final void main(String args[]) {
		//1. args Nunca es nulo, si no enviamos parámetros de entrada el arreglo es creado como un arreglo vacío.
		//2. Los parámetros que enviemos empezaran en la posición 0 de nuestro arreglo.
		//3. Los parámetros que recibamos son almacenados como Strings en nuestro arreglo, si ocupamos el parámetro como un
		//	 tipo de dato distinto (numérico, por ejemplo) tendríamos que realizar una conversión explícita del String.	
		
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

