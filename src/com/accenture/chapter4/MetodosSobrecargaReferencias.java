package com.accenture.chapter4;

public class MetodosSobrecargaReferencias {
	
	public static void fly(String s) {
		System.out.println("string"); 
	}
	
	public static void fly(Object o) {
		System.out.println("object"); 
	}
	
	public static void fly(CharSequence c) {
		System.out.println("charSequence"); 
	}
	
	public static void main(String args[]) {
		fly(1); 					//object
		
		fly(new Integer(1)); 		//object
		
		fly("test");				//string
		
		fly(new StringBuilder()); 	//charSequence
	}
}
