package com.accenture.chapter2.repaso;

public class BreakAndContinue {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		INNER : for(int i = 0; i < 10; i++) {
			int j = 0;
			OUTTER : do {
				System.out.println(i + 1);
			} while(j++ > 0);	
		}
	
	
		//Ejemplo 2
		FOR : for(int i = 0; i < 10; i++) {
			int j = 0;
			WHILE: while(j < 10)
				System.out.println(++j);
				break FOR;
		}
		
		//Ejemplo 3
		String[] names = {"Juan", "Pedro", "Pablo"};
		FOR : for(String name : names) {
			INNER_FOR : for(int i = 0; i < 5; i++) {
				if(i >= 1) continue FOR;
				else System.out.println(name);
			}
		}
	}
}
