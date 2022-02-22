package com.accenture.chapter3.repaso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimePeriodos {

	public static void main(String args[]) {

		
		// Ejemplo 1
		Period annually = Period.ofYears(1);		
		Period quarterly = Period.ofMonths(3); 
		LocalDate date = LocalDate.of(2015, Month.JANUARY, 1);
		date = date.plus(annually).plus(quarterly); 					
		System.out.println(date);
		
		
		
		// Ejemplo 2
		Period oneYoneW = Period.ofYears(1).ofWeeks(1);	
		LocalDate date2 = LocalDate.of(2015, Month.JANUARY, 1);
		date2 = date2.plus(oneYoneW); 					
		System.out.println(date2);
		
		
		
		// Ejemplo 3
		LocalDate date3 = LocalDate.of(2015, 1, 20);
		LocalTime time3 = LocalTime.of(6, 15);
		LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);
		Period period = Period.ofMonths(1);
		
		System.out.println(date3.plus(period)); 		
		System.out.println(dateTime3.plus(period)); 	
		System.out.println(time3.plus(period)); 
	}

}
