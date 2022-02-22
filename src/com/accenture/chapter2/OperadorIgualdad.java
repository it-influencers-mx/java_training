package com.accenture.chapter2;

public class OperadorIgualdad {

	public static void main(String args[]) {
		
		//------Comparación de tipo de datos numéricos
		int x = 1;
		double y = 1.0;
		char w = 'a';
		Integer o = new Integer(1);
		
		 // Compila
		if(x == y) {}
		if(x != y) {}
		
		//Compila
		if(w == y) {} 
		if(w != y) {}
		
		//Compila. Realiza el unboxing y compara el valor con el tipo de dato primitivo
		if(o == w) {} 
		if(o != w) {} 
		
		
		//------Comparación de valores booleanos
		int o1 = 1;
		boolean x1 =  true;
		boolean y1 = false;
		boolean w1 = o1 > 2 && x1;
		
		if(x1 == y1) {}
		if(x1 != y1) {}
		if(w1 == false) {}
		if(w1 != false) {}
		
		
		//------Comparación de objetos (Referencia a objetos)
		Object o2 = new Object();
		Integer x2 = new Integer(1); 
		Integer y2 = new Integer(1); 
		String s2 = "";
		
		if(o2 == x2) {} //Compila
		if(x2 == y2) {} //Compila
		System.out.println(x2 == y2); // Imprime falso, puesto que se compara la referencia no el valor del objeto.
		
		// ***Fuera del scope del examen.
		//Cuando asignamos los valores directamente a un Wrapper los objetos son tomados de un cache para un rango determinado.
		//Integer de -128 a 127 (inclusivo).
		//Byte, Short y Long tienen un rango de cache de -127 a 127 (inclusivo). 
		//Character tiene un rango de 0 a 127 (inclusivo).
		// Este rango puede ser modificado mediante un parámetro enviado a la JVM (Solo para Integers): -XX:AutoBoxCacheMax
		
		Integer m = 1; // Integer m = Integer.valueOf(1); Es equivalente, el compilador traduce la línea a este statement.
		Integer m1 = 1; // Integer m1 = Integer.valueOf(1); Es equivalente, el compilador traduce la línea a este statement.
		System.out.println(m == m1); // Imprime true, puesto que apuntan al mismo objet tomado del cache.
		////////
		
		//if(s2 == x2) {} // No compila. No pertenecen a la misma jerarquía de herencia.
		if(s2 == o2) {} // Compila.
		
		
		//------Mix de comparaciones - No compilan, puesto que solo se pueden aplicar los 3 escenarios previamente vistos.
		
//		boolean x3 = true == 3;
//		boolean y3 = false != "";
//		boolean w4 = 3 == "";
		
		
		//*********Ejemplos operadores igualdad vs operador de asignación***********************************************
		
		boolean p4 = false;
		boolean x4 = (p4 = true); //Se asigna la variable no se realiza una comparación
		//System.out.println(x4); // Imprime true
		
		int w4 = 1;
		//if(w4 = 1) {} // No compila, no se esta comparando se está asignando.
		
		
		//*********Ejemplos operadores igualdad referencia a objetos***********************************************
		Integer p5 = new Integer(1);
		Integer y5 = new Integer(1);
		Integer w5 =  p5;
		Integer o5 = null;
		Integer l5 = null;
//		
//		System.out.println(p5 == y5); // Imprime false
//		System.out.println(p5 == w5); // Imprime true
//		System.out.println(o5 == l5); // Imprime true
		
		boolean test = null == null; // Ejemplo válido.
		//boolean test1 = null == 1; //No compila
	}
}
