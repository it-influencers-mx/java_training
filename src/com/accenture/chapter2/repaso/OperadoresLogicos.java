package com.accenture.chapter2.repaso;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		String string = "";
		String string2 = null;

		if(string != null && string.isEmpty()) {
			System.out.println("String is empty 1");
		}
		
		if(string != null & string.isEmpty()) {
			System.out.println("String is empty 2");
		}
		
		if(string2 != null & string2.isEmpty()) {
			System.out.println("String is empty 3");
		}

		int x2 = 6;
		boolean y2 = (x2 >= 6) || (++x2 <= 7);
		System.out.println("x2: " + x2);
		System.out.println("y2: " + y2);
		
		boolean z2 =  (x2 >= 6) | (++x2 <= 7);
		System.out.println("z2: " + z2);

	}
	
}
