package com.accenture.chapter4.pond.duck;

import com.accenture.chapter4.pond.goose.Goose;

public class GooseWatcher {
	
	public void watch() {
		Goose goose = new Goose();
		goose.floatInWater(); 		// DOES NOT COMPILE
	}

}
