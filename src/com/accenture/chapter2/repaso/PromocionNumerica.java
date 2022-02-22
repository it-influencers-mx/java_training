package com.accenture.chapter2.repaso;

/** ¿Cuáles de las siguientes son declaraciones válidas **/

public class PromocionNumerica {
	
	public static void main(String[] args) {
		char ch = 'a';
		byte by = 1;
		short sh = 2;
		int in = 4;
		long lo = 3;
		float fl = 1.5f;
		double dob = 2.5;
		float fl2 = 1.0;
		
		char result1 = ch + 1;
		short result2 = sh * 2;
		short result3 = ch + sh;
		float result4 = sh * 2.0;
		double result5 = fl + fl;
		long result6 = ch + 1;
		short result7 = (short) in + 1;
		byte result8 = by;
		byte result9 = (short) lo + (short) fl;
		int result10 = in * 2;
		short result11 = 2 * 2;
		short result12 = (short) (2 * in);
		short result12 = short (2 * lo);
		sh++;
		by++;
		short result13 = sh++;
	}
	
}
