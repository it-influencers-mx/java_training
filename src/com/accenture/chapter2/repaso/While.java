package com.accenture.chapter2.repaso;

public class While {
	
	public static void main(String args[]) {
		
		
		//Ejemplo 1
		int a = 1;
		while(a++ > 1) {
			System.out.println(a);
			a++;
			
			if(a == 10) break;
			else continue;
		}
		
		//Ejemplo 2
		boolean b = false;
		while(b = false) {
			System.out.println(b);
			break;
		}
		
		//Ejemplo 3
		boolean c = false;
		int x1 = 0;
		while(!c) {
			int m = 0;
			x1++;
			if(x1 == 10) {
				m = x1 * 2;
				break;
			}
		}
		System.out.println(m);
		
		//Ejemplo 4
		int k = 1;
		while(k < 10)
			System.out.println(k);
			k++;
		
		System.out.println(k);	
		
		//Ejemplo 5
		while(false) {
			System.out.println("Dentro del while");
		}
	}
	
}
