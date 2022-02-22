package com.accenture.chapter3;

public class StringBuilderMetodos {
	
	public static void main(String[] args) {
		
		//Ejemplo 1 - Métodos compartidos con la clase String
		System.out.println("1-------------------------------"); 
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); //anim
		
		int len = sb.length();							// 7
		char ch = sb.charAt(6);							// s
		System.out.println(sub + " " + len + " " + ch); //anim 7 s
		
		StringBuilder sb1 = new StringBuilder("hola");
		//String sub1 = sb.substring(0, 4).append(" mundo"); //No compila, el método substring regresa un String NO un StringBuilder.
		
		
		
		//Ejemplo 2 - append()
		System.out.println("2-------------------------------");
		StringBuilder sba = new StringBuilder("hola").append(" ").append(" mundo").append(1).append(true).append(new Object());
		System.out.println(sba); //"hola mundo1truejava.lang.Object@15db9742" -> La última parte varía en cada ejecución. 
		
		//Nota: El método println manda llamar el internamente el método "String.valueOf(parametro)" el cual manda llamar
		//		el método toString() del objeto o retorna "null" si el objeto es null.
		
		
		
		//Ejemplo 3 - insert()
		System.out.println("3-------------------------------");
		StringBuilder sbb = new StringBuilder("animals");
		sbb.insert(7, "-"); 		// sb = animals-
		sbb.insert(0, "-"); 		// sb = -animals-
		sbb.insert(4, "-"); 		// sb = -ani-mals-
		System.out.println(sbb);
		//sbb.insert(11, "-"); 		// StringIndexOutOfBoundsException
		
		
		
		//Ejemplo 4 - delete() / deleteCharAt()
		System.out.println("4-------------------------------");
		StringBuilder sbc = new StringBuilder("abcdef");
		sbc.delete(1, 3); 			// sb = adef
		//sbc.deleteCharAt(5); 		// StringIndexOutOfBoundsException
		//sbc.delete(5, 1);			// Lanza StringIndexOutOfBoundsException
		//sbc.delete(-1, 1);		// Lanza StringIndexOutOfBoundsException
		sbc.delete(1, 1);			// NO elimina nada.
		System.out.println(sbc); 	// sb = adef
		sbc.delete(0, 5); 			// Elimina todo, NO lanza StringIndexOutOfBoundsException.
		System.out.println(sbc); 	// "" String vacío.
		
		
		
		//Ejemplo 5 - reverse()
		System.out.println("5-------------------------------");
		StringBuilder sbd = new StringBuilder("ABCD");
		sbd.reverse();	
		System.out.println(sbd); 	//"DCBA"
		
		
		
		//Ejemplo 6 - toString()
		System.out.println("6-------------------------------");
		StringBuilder sbe = new StringBuilder("ABCD");
		String str = sbe.toString();
		System.out.println(str);
		
		//StringBuilder sbf = ""; 				//No compila, no podemos asignar un String directamente a un StringBuilder.
		//String stra = new StringBuilder();  	//No compila, no podemos asignar un StringBuilder directamente a un String.
	}
	
}
