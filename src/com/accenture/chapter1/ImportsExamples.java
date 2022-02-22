package com.accenture.chapter1;

import java.nio.*; // Compile, but it's not importing the classed under java.nio.file
//import java.nio.*.*; // Doesn't compile, only one wildcard is supported and should be at the end.
import java.nio.file.Paths.*; // Compile but it's not actually importing Paths.

import java.nio.file.Paths; // Correct way for importing the class Paths.

public class ImportsExamples {
	private Paths p;
	
	String last = "" + full;
	
	static String full = "Full";

}
