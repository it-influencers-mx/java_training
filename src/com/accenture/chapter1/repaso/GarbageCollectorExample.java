package com.accenture.chapter1.repaso;

import java.util.Date;

public class GarbageCollectorExample {

	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		
		for(int i = 0; i < 10; i++) {
			GarbageCollectorExample g = new GarbageCollectorExample();
			
			if(i == 1) {
				o1 = o2;
			}
			
			if(i == 2) {
				o2 = null;
			}
			
			if(i == 3) {
				o3 = o2;
			}
			
			System.gc();
		}
		
		Date date = new GarbageCollectorExample().getImportantDate();
		
	}
	
	public Date getImportantDate() {
		Date date = new Date();		//Date A 
		Date date2 = new Date();    //Date B
		Date date3 = new Date();    //Date C
		Date date4;
		
		date = date3;
		date2 = new Date();
		date4 = date;
		date3 = date2;
		
		return date;
	}
	
	@Override
	public void finalize() {
		System.out.println("Antes de ser destruido");
	}
}
