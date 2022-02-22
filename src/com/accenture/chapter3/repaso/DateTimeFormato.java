package com.accenture.chapter3.repaso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormato {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
		
		System.out.println(time1.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime1.format(DateTimeFormatter.ISO_LOCAL_TIME));	
		System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_TIME));				
		
		
		
		//Ejemplo 2
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(LocalTime.of(11, 12, 34)));
		
		
		
		//Ejemplo 3
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(dateTime2.format(shortF));
		
		
		
		//Ejemplo 4
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time3 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd, yyyy, hh:mm");
		System.out.println(dateTime3.format(f));
		
		
		
		//Ejemplo 5
		LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time4 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime4 = LocalDateTime.of(date4, time4);
		System.out.println("Ejemplo 6----------------");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(f2.format(dateTime4));
		System.out.println(date4.format(f2));		
		
		
		
		//Ejemplo 6
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date5 = LocalDate.parse("01 02 2020", f3);
		LocalTime time5 = LocalTime.parse("11:22");
		System.out.println(date5); 
		System.out.println(time5);
	}
	
}
