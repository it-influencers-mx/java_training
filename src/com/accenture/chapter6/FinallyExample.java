package com.accenture.chapter6;

public class FinallyExample {

	public static void main(String args[]) {
		//Ejemplo 1
		//finllayTest();
		
		
		//Ejemplo 2
		//finallyTestSystemExit();
		
		
		//Ejemplo 3
		//recoveringFromException();
		
		
		//Ejemplo 4
		//int result = finallyOverwritesReturn();
		//System.out.println(result);
		
		//Ejemplo 6
		complexFinallyFlow();
	}
	
	
	//Ejemplo 1
	private static void finllayTest() {
		try {
			throw new RuntimeException();
		} finally {
			System.out.println("Dentro de finally");
		}
	}
	
	
	//Ejemplo 2
	private static void finallyTestSystemExit() {
		try {
			throw new RuntimeException();
		} catch(Exception e){
			System.exit(0);
		}finally {
			System.out.println("Dentro de finally");
		}
	}
	
	
	//Ejemplo 3 - Recovering from excepcion
	private static void recoveringFromException() {
		explore();
	}
	
	
	//Ejemplo 4 - Finally sobreescribe lo último que se haya enviado.
	private static int finallyOverwritesReturn() {
		try {
			return 1;
		} catch(Exception ex) {
			return 2;
		} finally {
			return 3;
		}
	}
	
	//Ejemplo 5 - El orden  de finally/catch es importante 
	/*
	    private static int finallyCatchOrder() {
			try {
				return 1;
			} finally {
				return 3;
			} catch(Exception ex) {
				return 2;
			}
		}
	*/
	
	
	//Ejemplo 6
	static void complexFinallyFlow() {
		String s = "";
		try {
			s += "t";
		} catch(Exception e) {
			s += "c";
		} finally {
			s += "f";
		}
		s += "a";
		System.out.print(s); //tfa
	}
	

	static void explore() {
		try {
			seeAnimals();
			fall();
		} catch (Exception e) {
			getUp();
		} finally {
			seeMoreAnimals();
		}
		
	}

	static void fall() {
		throw new RuntimeException();
	}
	
	static void seeAnimals() {
		System.out.println("Seeing animals...");
	}
	
	static void seeMoreAnimals() {
		System.out.println("Seeing more animals...");
	}
	
	
	static void getUp() {
		System.out.println("Getting up...");
	}
	
	
}
