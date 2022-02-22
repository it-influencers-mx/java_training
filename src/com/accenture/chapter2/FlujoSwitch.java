package com.accenture.chapter2;

import java.time.DayOfWeek;

public class FlujoSwitch {
	public static void main(String args[]) {
		
		//Los case deben ser del mismo tipo de dato que la variable que se evalua en el switch
		int x = 0;
		switch(x) {
			default:
				System.out.println("Case default");
				break;	
			
			/*case "":  // No compila
				System.out.println("Case Vacio");
				break;*/
		
			case 1 :
				System.out.println("Case 1");
				break;
		}
		
		
		//Se pueden utilizar variables siempre y cuando sean declaradas como final e inicializadas en el mismo statement.
		final int y = 1;
		final int b = 2;
		final Integer n = 3;
		long m = 4;
		int z = 0;
		switch(20) {
		//switch(m) { //No compila, los tipos long, boolean, double, float no están permitidos
		//switch(z) {
			default:
				System.out.println("Case default");
				//break;	
		
//			case 1 :  //Si se descomenta hay un error de compilación con el case y.
//				System.out.println("Case 1");
//				break;
				
			case y :  //Es posible tener este caso, pero en este escenario el value se repite y no compila si ambos están presentes.
				System.out.println("Case y = 1");
				break;
				
			case b:
				System.out.println("Case o");
				break;
		}
		
		
		//Ejemplo utilizando Enums
		DayOfWeek day = DayOfWeek.of(1);
		switch(day) {
			case MONDAY:
				System.out.println("Monday");
				break;
			
			case WEDNESDAY:
				System.out.println("Wednesday");
				break;
	
			/*case DayOfWeek.THURSDAY : //No compila, el swicth identifica el tipo y el qualifier DayOfWeek (Nombre del Enum no es requerido)
				System.out.println("Thursday");
				break;*/
		}
		
		//Ejemplo utilizando Strings
		String cadena =  "abc";
		final String MX = "MX";
		
		switch(cadena) {
			case "A" :
				//int b1 = 0;
			/*case 'a' : //No compila porque no es un String, sino un char
				System.out.println("Monday");
				break; */
				
			case MX :
				System.out.println("MX");
				//int b1 = 2; //No compila variable declarada en un case anterior.
				int b1 = 2; // Si compila, solo reasigna el valor.
				break;
				
			case "a" : 
				System.out.println("Monday");
				b1 = 1;
				int z1;
				break;
				
			default:
				//System.out.println(z1); //No compila, la variable z1 no está inicializada.
				break;
		}
		
		// System.out.println(b1); //No compila, b1 fuera de scope.
		
		switch(x) {} //Switch vacío.
		
		switch(x) { //Multiples case
			default:
			case 1:
			case 2:
			case 3:
				System.out.println("Case 1: Case 2");
		}
		
		switch(x) { //Multiples case
			default:
				System.out.println("Default");
			case 1:
			case 2:
			case 3:
				System.out.println("Case 1: Case 2");
		}
		
		byte some = 10;
		switch(some) {
			case 127 :
				System.out.println("10");
				break;
			case 'A':
				System.out.println("A");
				break;
			
			case 'z':
				System.out.println("z");
				break;
			
			/*case 128:
				System.out.println("z");*/
				
			/*case 122: //'z'
				System.out.println("122");
				break;*/
				
			/*case 65: //'A'
				System.out.println("65");
				break;*/
		}
	}
}
