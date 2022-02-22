package com.accenture.chapter5.inheritance;

public class FinalMethods {

}

class Bird {
	public final boolean hasFeathers() {
		return true;
	}
}

class Penguin extends Bird {
	public final boolean hasFeathers() { // DOES NOT COMPILE
		return false;
	}
}
