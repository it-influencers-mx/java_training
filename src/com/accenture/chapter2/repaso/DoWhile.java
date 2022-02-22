package com.accenture.chapter2.repaso;

public class DoWhile {
	
	public static void main(String args[]) {
		
		
		//Ejemplo 1
		int a = 1;
		do 
			System.out.println(a);
		while(a++ > 1)
		
		//Ejemplo 2
		int b = 0;
		do
			System.out.println(b);
			b++;
		while(b < 10);
		
		//Ejemplo 3
		int k = 1;
		
		do {
			System.out.println(k);
		} while(false);
			
		
		//Ejemplo 4
		boolean z = true;
		int c = 1;
		do {
			int n = 1;
			c++;
			
			if(c > 8) {
				n += c;
				break;
			} else {
				continue;
			}
			
			
		} while(z);
		System.out.println(n);

		//Ejemplo 5
		do 
			System.out.println("Hola Mundo");
		while(true);
	}
	
}
