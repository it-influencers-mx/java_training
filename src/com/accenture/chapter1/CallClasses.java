package com.accenture.chapter1;

import com.accenture.chapter1.otherPackage.*;

public class CallClasses {
	
	private void callMultipleClasses() {
		new MultipleClasses(); //Defined as public. Within the same package.
	}
	
	private void callClass2A() {
		new Classes2A(); // Defined as default. Within the same package.
	}
	
	private void callClasses2B() {
		new Classes2B(); // Defined as default. Different package. Doesn't compile, it's not visible from outside the package.
	}
	
	private void callMultipleClassesDifferentPackage() {
		new MultipleClassesDifferentPackage(); //Defined as public. Different package. Compile, but import is needed.
	}
	
}
