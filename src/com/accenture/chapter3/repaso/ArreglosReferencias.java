package com.accenture.chapter3.repaso;

public class ArreglosReferencias {
	String[] nombres; //Se inicializa en null como los otros objetos. Cap 2.
	
	public static void main(String... args) {
		
		//Ejemplo 1 
		System.out.println("1----------------"); 	
		String [] a = { "1", "2", "3"};
		String [] b = { "1", "2", "3"};
		String [] c = a;
		Integer[] d = { 1, 2, 3 };
		System.out.println(a.equals(b)); 
		System.out.println(a == b);
		System.out.println(c == a);
		System.out.println(a[0].equals(b[0]));
		System.out.println(a == d);
		
		
		
		//Ejemplo 2
		System.out.println("2----------------"); 	
		String[] a1 = new String[10];
		String[] b1 = {null, "", null};
		String[] c1 = {};
		String[] d1 = null;
		String[] e1 = new String[] {"", ""};
		System.out.println(a1.length); 	
		System.out.println(b1.length); 
		System.out.println(c1.length); 	
		System.out.println(d1.length); 
		System.out.println(d1.length()); 
		
		
		
		//Ejemplo 3
		System.out.println("3----------------"); 	
		String strings[] = new String[10]; 	
		int numbers[] = new int[10]; 		
	
		for(String i : strings) {
			System.out.print(i + " "); 	
		}
		
		for(int i : numbers) {
			System.out.print(i + " "); 	
		}
	}
}
