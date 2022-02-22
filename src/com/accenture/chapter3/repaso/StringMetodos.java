package com.accenture.chapter3.repaso;

public class StringMetodos {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		String str = "";
		for(int i = 1; i <= 10; ) {
			str += i;
			i++;
		}
		//System.out.println(str.length);
		
		
		
		//Ejemplo 2
		//String char0 = "01234".charAt(0);
		//String numbers = char0 + "1234";
		//System.out.println(numbers.equals("01234"));
		
		
		
		//Ejemplo 3
		System.out.println("012345".indexOf("6", 6)); 
		
		
		
		//Ejemplo 4
		System.out.println("01234".substring(0,0)); 	
		
		
		
		//Ejemplo 5
		System.out.println("01234".substring(0,4)); 	
		
		
		
		//Ejemplo 6
		System.out.println("01234".toUpperCase().equals("01234".toLowerCase())); 
		
		
		
		//Ejemplo 7
		String a1 = "abc";
		String a2 = new String("abc");
		String a3 = "AbC";
		System.out.println(a1.equals(a2)); 				
		System.out.println(a3.equals(a3)); 				
		System.out.println(a3.equalsIgnoreCase(a2));
		
		
		
		//Ejemplo 8 - startsWith()/endsWith()
		System.out.println("abc".startsWith("a")); 		
		System.out.println("abc".endsWith("abc")); 		
		System.out.println("".endsWith("")); 			
		
		
		
		//Ejemplo 9
		System.out.println("abc".contains("bc")); 		
		System.out.println("".contains("")); 			
		
		
		
		//Ejemplo 10
		System.out.println("abc".replace('a', 'A'));
		System.out.println("abc".replace("a", new StringBuilder("A")));
		System.out.println("abc".replace("d", "a")); 
		System.out.println("".replace("", "123"));
		System.out.println("----------Test");
		System.out.println("abc".replace("", "123")); //123a123b123c123
		 
		
		
		//Ejemplo 11
		System.out.println("\t\n  abc  \t\r\t   ".trim()); 		
		System.out.println("\t\n  a\t b c  \t\r\t   ".trim());	
		
		
		
		//Ejemplo 12
		System.out.println("hola".concat(" mundo").toUpperCase());	
	}
	
}
