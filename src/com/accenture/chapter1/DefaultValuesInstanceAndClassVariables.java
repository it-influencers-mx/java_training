package com.accenture.chapter1;

public class DefaultValuesInstanceAndClassVariables {
	double w_double;
	int x_int;
	long y_long;
	static boolean z_boolean;
	char a_char;
	String b_reference;
	float f_float;
	int l = x_int + 1;
	
	public static void main(String args[]) {
		DefaultValuesInstanceAndClassVariables example = new DefaultValuesInstanceAndClassVariables();
		
		System.out.println("double: " + example.w_double);
		System.out.println("float: " + example.f_float);
		System.out.println("int: " + example.x_int);
		System.out.println("long: " + example.y_long);
		System.out.println("boolean: " + example.z_boolean);
		System.out.println("char: " + example.a_char); //Caracter no desplegable 'NUL' distinto a null.
		System.out.println("char: " + (int) example.a_char); //Equivalente a 0 en formato numerico ASCII
		System.out.println("reference: " + example.b_reference);
	}
}
