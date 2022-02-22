package com.accenture.chapter6;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsWithinCatchOrFinally {

	// Ejemplo 1
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = read();
		} catch (IOException e) {
			// Nested try
			try {
				if (reader != null)
					reader.close();
			} catch (IOException inner) {

			}
		}
	}

	// Ejemplo 2
	static void finallyExceptionTest() throws Exception {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			throw new RuntimeException();
		} finally {
			throw new Exception();
		}
	}

	// Ejemplo 3
	public String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += " after";
			} catch (NullPointerException e) {
				result += " catch";
				throw new RuntimeException();
			} finally {
				result += " finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result += " done";
		}
		return result; // before catch finally done
	}

	private static FileReader read() throws IOException {
		return null;
	}
}
