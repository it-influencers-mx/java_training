package com.accenture.chapter5.inheritance;

public class MethodOverridingPrivate {

}

class Camel {
	private String getNumberOfHumps() {
		return "Undefined";
	}
}

class BactrianCamel extends Camel {
	private int getNumberOfHumps() {
		return 2;
	}
}
