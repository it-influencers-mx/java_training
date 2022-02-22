package com.accenture.chapter5.interfaces;

public class InterfaceVariables {

}

//Ejemplo 1 - Ambas interfaces son equivalentes. En caso de que nosotros no lo especifiquemos, el compilador insertará los modificadores public,static,final.
interface CanSwim {
	int MAXIMUM_DEPTH = 100;
	final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}

interface CanSwim2 {
	public static final int MAXIMUM_DEPTH = 100;
	public static final boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}



//Ejemplo 2 - Los modificadores private, protected y final no son compatibles con las variables de la interfaz.
interface CanDig {
	private int MAXIMUM_DEPTH = 100; // DOES NOT COMPILE
	protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE
	public static String TYPE; // DOES NOT COMPILE
}
