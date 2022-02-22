package com.accenture.chapter4.pond.goose;

import com.accenture.chapter4.pond.shore.Bird; // in a different package

public class Gosling extends Bird { // extends means create subclass
	
	public void swim() {
		floatInWater(); 			// calling protected member
		System.out.println(text); 	// calling protected member
		
		
	}
	
	public void gooseTest() {
		// new Goose().floatInWater();	//No compila.
	}
	
}
