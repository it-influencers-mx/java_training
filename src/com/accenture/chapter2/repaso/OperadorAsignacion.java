package com.accenture.chapter2.repaso;

public class OperadorAsignacion {
	
	public static void main(String[] args) {
		
		boolean x1 = false;
		int n1 = 1;
		int n2 = 2;
		char m1 = 'a';
		short m2 = 2;
		double m3 = 2.0;
		
		boolean result1 = (x1 = true);
		boolean result2 = !result1;
		boolean result3 = result2 == false;
		
		int y1 = (int) 1.5;
		int y2 = -y1;
		
		m1 += n1;
		m2 *= m3 + n1; // Equivalente a m2 = m2 * (m3 + n1);
		System.out.println(m2); //6
		
	}
	
}
