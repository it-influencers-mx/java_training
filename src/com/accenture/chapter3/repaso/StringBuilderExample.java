package com.accenture.chapter3.repaso;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		//Ejemplo 1
		StringBuilder sbA = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			sbA.append(i + 1);
		}
		System.out.println(sbA);
		
		
		
		//Ejemplo 2
		StringBuilder sbB = new StringBuilder(5);
		for(int i = 0; i < 10; i++) {
			sbB.append(i + 1);
		}
		System.out.println(sbB.length());
		
		
		
		//Ejemplo 3
		StringBuilder sbC = new StringBuilder("Hola");
		StringBuilder sbD = new StringBuilder(sbC).append(" mundo");
		System.out.println(sbD);
		
		
		
		//Ejemplo 4
		StringBuilder sbE = new StringBuilder("1");
		StringBuilder sbF = sbE.append("2");
		sbF.append("3");
		System.out.println(sbE);
		
		
		
		//Ejemplo 5
		StringBuilder sbG = new StringBuilder("hola");
		StringBuilder sbH = new StringBuilder("hola");
		System.out.println(sbG.equals(sbH)); 						
		
		
		
		//Ejemplo 6
		StringBuilder sbI = new StringBuilder("hola");
		StringBuilder sbJ = sbI;
		sbJ.concat(" mundo");
		System.out.println(sbI); 		
	}
}
