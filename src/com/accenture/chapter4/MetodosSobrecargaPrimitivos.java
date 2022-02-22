package com.accenture.chapter4;

public class MetodosSobrecargaPrimitivos {

	public static void fly(int i) {
		System.out.print("int ");
	}

	public static void fly(long l) {
		System.out.print("long ");
	}
	
	public static void fly(Integer l) {
		System.out.print("Integer ");
	}

	public static void main(String args[]) {
		fly(123); 				//int

		fly(123L); 				//long
		
		fly((short) 1); 		//int
		
		fly(new Integer(1));	//Integer
	}
}
