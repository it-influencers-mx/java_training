package com.accenture.chapter1.repaso;

public class DefaultValuesLocalVariables {
	public void test(){
		int x;
		final boolean falso = true;
		if(falso) {
			x = 1;
		}
		
		System.out.println(x);
	}
	
	public void test2(){
		int x;
		
		if(!false) {
			x = 1;
		}
		
		System.out.println(x); 
	}
	
	public void test3(){
		int x;
		int y = 1;
		
		if(1 == 1) {
			x = 1;
		}
		
		System.out.println(x); 
	}
	
	public void test4(){
		int x;
		int y = 1;
		
		switch(y) {
			case 2: 
			default: x = 1;
		}
		
		System.out.println(x);
	}
	
	public void test5(){
		int x;
		// int y = x; // No compila
		
		switch(y) {
			default: x = 1;
		}
		
		System.out.println(x);
	}
	
	public void test6(){
		// int y, int z = 0; // No compila.
		int x;

		if(z == 0) {
			x = 1;
		} else {
			x = 0;
		}
		
		System.out.println(x);
	}
}
