package com.accenture.chapter3.repaso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeCreacion {
	
	public static void main(String args[]) {
		
		//Ejemplo 1 
		LocalDate date1 = LocalDate.of(2020, 0, 20);
		System.out.println(date1);
		

		
		//Ejemplo 2
		LocalTime time1 = LocalTime.of(23, 15, 30, 200);
		System.out.println(time1);
		
		
		//Ejemplo 3
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);						
		System.out.println(dateTime1);
		
		
		//Ejemplo 4
		LocalDate d = new LocalDate(2020, 1, 1);
		System.out.println(d);
	}
	
}
