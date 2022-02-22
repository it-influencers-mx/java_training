package com.accenture.chapter5.inheritance;

public class HidingVariables {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();
		mouse.getMouseDetails();
	}
}

class Rodent {
	protected int tailLength = 4;

	public void getRodentDetails() {
		System.out.println("[parentTail=" + tailLength + "]");
	}
}

class Mouse extends Rodent {
	//protected int tailLength = 8;
	private static final double tailLength = 8; // NO tenemos restricción en cuanto al tipo de dato, modificador de acceso, especificador opcional.

	public void getMouseDetails() {
		System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
	}
}