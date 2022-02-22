package com.accenture.chapter4;

public class MetodosSobrecargaAutoboxing {
	
	public static void fly(Integer num) {
		System.out.println("Integer"); 
	}
	
	public static void fly(int num) {
		System.out.println("int"); 
	}
	
	public static void main(String args[]) {
		fly(1); //int
		
		fly(new Integer(1)); //Integer
	}
}
