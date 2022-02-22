package com.accenture.chapter1.repaso;

public class BloqueInicializacionInstancia {
	{ System.out.println("E"); }
	
	public BloqueInicializacionInstancia() {
		System.out.println("U");
		m = x + 5;
	}
	
	int x = 0;
	
	{
		System.out.println("I");
		for(int i = 0; i < 10; i++) {
			x = x + 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println(new BloqueInicializacionInstancia().x);
	}
	
	int y = x;
	int z = y;
	
	{
		System.out.println("O");
	}
	int m = 0;
}
