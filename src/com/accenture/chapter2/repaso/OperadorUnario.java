package com.accenture.chapter2.repaso;

public class OperadorUnario {
	
	public static void main(String[] args) {
		
		int x1 = 2;
		int y1 = x1++;
		int z1 = ++y1;
		System.out.println("x1: " + x1);
		System.out.println("y1: " + y1);
		System.out.println("z1: " + z1++);
		
		int x = 1;
		int y = 2;
		int z = 3;
		int result1 = x++ - --y * z++ % x++;
		System.out.println("result1: " + result1);
		
	}
	
}
