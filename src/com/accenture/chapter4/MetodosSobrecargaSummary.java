package com.accenture.chapter4;

public class MetodosSobrecargaSummary {
	public static String glide(String s) {
		return "1";
	}

	public static String glide(String... s) {
		return "2";
	}

	public static String glide(Object o) {
		return "3";
	}

	public static String glide(String s, String t) {
		return "4";
	}
	
	public static void play(Long l) { }
	
	public static void play(Long... l) { }

	public static void main(String[] args) {
		System.out.print(glide("a"));
		System.out.print(glide("a", "b"));
		System.out.print(glide("a", "b", "c"));
		
		//play(4); // DOES NOT COMPILE
		play(4L); // calls the Long version
	}
}
