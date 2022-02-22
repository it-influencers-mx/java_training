package com.accenture.chapter2.repaso;

public class For {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		for(;;);
		
		//Ejemplo 2
		for(int i = 0; ; i++) {
			System.out.println(i + 1);
			if(i == 9) break;
		}
		
		//Ejemplo 3
		for(int i = 0; i < 10; ) {
			System.out.println(++i);
		}
		System.out.println(i);
		
		//Ejemplo 4
		int x = 0;
		for(int i = 1, x = 1; i < 10; i++,x++) {
			System.out.println(i);
		}
		
		//Ejemplo 5
		int i;
		for(i = 0; i < 10; )
			System.out.println(i);
			i++;
		
		//Ejemplo 6
		int m = 0;
		for(;;)
			System.out.println(++m);
		
	}
	
}
