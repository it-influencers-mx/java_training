package com.accenture.chapter3.repaso;

import java.time.LocalDate;

public class StringConcateancion {
	public static void main(String[] args) {
        
		//Ejemplo 1
        int tres = 3;
        String cuatro = "4";
        System.out.println(1 + cuatro + (2 + tres) + tres);

        
        
        // Ejemplo 2  
        String s = null; 
        s += "1"; 		
        s += null; 		
        System.out.println(s);

        
        
        //Ejemplo 3
        String a = null;
        System.out.println(a + 5); 
        
        
        
        //Ejemplo 4
        System.out.println(null); 
        
        
        
        //Ejemplo 5
        Object obj = new Object();
        LocalDate ld = LocalDate.now();
        System.out.println("" + obj + ld);
        
        
        
        //Ejemplo 6
        Object obj1 = new Object();
        LocalDate ld1 = LocalDate.now();
        System.out.println(obj1 + ld1 + "");
        
        
        //Ejemplo 7
        System.out.println(null + ""); 
        
    }
}
