package com.accenture.chapter5.polymorphism;

public class PolimorfismoEjemplo {

}

class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
	public boolean isTailStriped() {
		return false;
	}

	public int age = 10;

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		
		
		//No compila
		System.out.println(hasTail.age); 			 // DOES NOT COMPILE. Solo tenemos acceso a las variables y métodos de la referencia.
		System.out.println(primate.isTailStriped()); // DOES NOT COMPILE. Solo tenemos acceso a las variables y métodos de la referencia.
		
		
		//Casteo
		Lemur lemurCastIncorrect = primate;	// No compila. Se necesita un cast explícito.
		Lemur lemurCastCorrect = (Lemur) primate;
		Lemur lemurCastNoRelated = (Lemur) new StringBuilder(); // No compila. No se puede castear entre objetos no relacionados.
		Primate primateCast = new Primate();
		Lemur isNotALemur = (Lemur) primateCast; //ClasCastExcetion. El objeto en memoria no es un lemur.
	}
}
