package com.accenture.chapter3.repaso;

public class StringBuilderMetodos {
	
	public static void main(String[] args) {
		
		//Ejemplo 1 
		StringBuilder sbA1 = new StringBuilder("12345");
		sbA1.append("67").substring(0, 1).toUpperCase().insert(3, "1");
		System.out.println(sbA1);
		
		
		
		//Ejemplo 2
		StringBuilder sbB1 = new StringBuilder("abcdef");
		sbB1.insert(1, "0"); 		
		sbB1.insert(0, "0"); 		
		sbB1.insert(8, "0"); 		
		System.out.println(sbB1);
		
		
		
		//Ejemplo 3
		StringBuilder sbc = new StringBuilder("abcdef");
		sbc.delete(1, 1);
		sbc.delete(1, 3);
		System.out.println(sbc);
		
		
		
		//Ejemplo 4
		StringBuilder sbd = new StringBuilder("ABCD");
		sbd.reverse();	
		System.out.println("ABCD".equals(sbd.reverse().toString()));
		
		
		
		//Ejemplo 5
		StringBuilder sbe = "Hola";
		sbe.append("1").reverse().append(false);
		System.out.println(sbe);
		
	}
	
}
