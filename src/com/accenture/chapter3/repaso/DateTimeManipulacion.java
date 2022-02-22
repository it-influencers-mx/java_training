package com.accenture.chapter3.repaso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeManipulacion {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date);
		date.plusDays(2).minusDays(5).plusYears(2);
		System.out.println(date); 	
	
		
		
		
		//Ejemplo 2
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 31);
		date1.plusMinutes(10);
		System.out.println(date1); 	

		
		
		
		//Ejemplo 3
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date2, time2);
		dateTime = dateTime.plusDays(1).minusHours(4);
		System.out.println(dateTime);
		
	}
}
