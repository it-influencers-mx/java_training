package com.accenture.chapter3.repaso;

public class WrapperClasses {
	public static void main(String args[]) {
		
		//Ejemplo 1
		int int1 = Integer.parseInt("123");
		int int2 = Integer.parseInt("123.0");
		int int3 = Integer.valueOf("123");
		String int4 = Integer.parseInt("123").toString();
		String int5 = Integer.valueOf("123").toString();
		
		
		
		//Ejemplo 2
		float float1 = Float.parseFloat("12.0_0");
		float float2 = Float.parseFloat("12.00");
		float float3 = Float.parseFloat("12.00f");
		
		
		
		//Ejemplo 3
		long long1 = new Long(1);	 //
		long long2 = new Integer(1); //
		//Long long3 = new Integer(1);
		int intTest = new Long(1);
		double doubleTest = new Long(1);
	}
}
