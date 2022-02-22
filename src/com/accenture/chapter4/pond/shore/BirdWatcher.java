package com.accenture.chapter4.pond.shore;

import com.accenture.chapter4.pond.goose.Goose;

public class BirdWatcher {
	
	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater(); 			// calling protected member
		System.out.println(bird.text); 	// calling protected member
	}
	
	
	public void gooseTest() {
		new Goose().floatInWater();	  //Si compila, el método floatInWater() es declarado en la clase Bird, por lo que solo se puede acceder desde subclases o clases del mismo package.
	}
}
