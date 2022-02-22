package com.accenture.chapter4;

public class MetodosSobrecarga {
	
	public void fly(int numMiles) { 
		System.out.println("int"); 
	}
	
	//public int fly(int numMiles) { } 			// DOES NOT COMPILE
	//public static void fly(int numMiles) { } 	// DOES NOT COMPILE
	
	public void fly(short numFeet) { 
		System.out.println("short"); 
	}
	
	public boolean fly() {
		System.out.println("empty");
		return false; 
	}
	
	void fly(int numMiles, short numFeet) { 
		System.out.println("int short"); 
	}
	
	public void fly(short numFeet, int numMiles) throws Exception {
		System.out.println("short int"); 
	}
	
	public void fly(String[] args) {
		
	}
	
//	public void fly(String...args) { //No compila. El método fly(String[] args) es equivalente.
//		
//	}
	
	////Test method overloading
	public void testMethods() throws Exception {
		fly((short) 1);			//short
			
		fly(1);					//int
			
		fly();					//empty
		
		fly((short) 1, 1);		//short int
		
		fly(1, (short) 1);		//int short
		
		//fly((short) 1, (short) 1); //No compila, es ambiguo. Java no sabe cual de los métodos llamar.
		
		//fly(1, 1); 				 // No compila. No hay sobrecarga de dos ints.
	}
	
}
