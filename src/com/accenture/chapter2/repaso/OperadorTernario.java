package com.accenture.chapter2.repaso;

import java.util.ArrayList;
import java.util.Date;

public class OperadorTernario {
	public static void main(String args[]) {
		double a = 1.0;
		int b = 2;
		short c = 1;
		boolean d = true;
		
		//Ejemplo 1
		//short x = a > b ? 2 + c : 0; //No compila
		
		//Ejemplo 2
		Object x1 = d ? "" : new Date();
		
		//Ejemplo 3
		int x2 = a > b || !d ? b + 1 : a > 10 ? c * 2 : 1;
		
		StringBuilder sb = new StringBuilder(new StringBuilder());
		sb.append("123456789123456789234567823456789345678345678345678");
		System.out.println(sb);
		new ArrayList<>(10);

	}
}
