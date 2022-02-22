package com.accenture.chapter2;

public class OperadoresLogicos {
	public static void main(String args[]) {

		int x1 = 1;
		short y1 = 2;

		boolean w1 = x1 > y1 & x1 < 10; // AND
		boolean w2 = x1 > y1 | x1 < 10; // OR
		boolean w3 = x1 > y1 ^ x1 < 10; // XOR

		// Operadores de corto circuito
		boolean w4 = true || y1 < 4; // OR
		boolean w5 = false && y1 < 4; // AND

		Integer o = new Integer(1);
		if (o != null && o.intValue() == 1) { } // Evalua la segunda expresión solo cuando la primera es true
		if (o != null & o.intValue() == 1) { } // Evalua ambas expresions sin importar el resultado de la primer expresión.

		int x2 = 6;
		// La segunda expresión no se evalua porque se puede obtener el resultado solo
		// evaluando la primer expresion.
		boolean y2 = (x2 >= 6) || (++x2 <= 7);
		System.out.println(x2); // x2 es igual a 6
	}
}
