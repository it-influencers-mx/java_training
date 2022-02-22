package com.accenture.chapter1;

public class DefaultValuesLocalVariables {
	
	public void test(){
		int x;
		//boolean alwaysTrue = true;
		if(true) {
			x = 1;
		}
		
		System.out.println(x);
	}
	
	public void test2(){
		int x;
		
		if(false) {
			x = 1;
		}
		
		//System.out.println(x); No compila
	}
	
	public void test3(){
		int x;
		int y = 1;
		
		if(y == 1) {
			x = 1;
		}
		
		//System.out.println(x); // No compila
	}
	
	public void test4(){
		int x;
		int y = 1;
		
		switch(y) {
			case 2: break;
			default: x = 1;
		}
		
		//System.out.println(x); // No compila
	}
	
	public void test5(){
		int x;
		int y = 1;
		
		switch(y) {
			default: x = 1;
		}
		
		System.out.println(x);
	}
	
}
