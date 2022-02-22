package com.accenture.chapter4;

import java.io.IOException;

public class MetodosDeclaracion {
	
	public static void main(String args[]) {
		
	}
	
	//Diferentes maneras de declarar un m�todo.
	
	void metodoA() {}
	
	void metodoB() { return; }
	
	public int metodoC(){ return 1; }

	protected int metodoD(){ return 1; }
	
	final public synchronized void metodoE1_(){}
	
	public final synchronized static void $1metodoF(int a, int b){}
	
	public static void _metodoG() throws IOException, NullPointerException, IndexOutOfBoundsException {
		
	}
	
	static final synchronized public void metodoH() {}
	
	//static final synchronized default void metodoI() {} // No compila, default no es no modificador de acceso.
	
	//void static final synchronized public metodoJ() {} //No compila, tipo de retorno, nombre del m�todo y lista de par�metros deben ir siempre en ese orden.
	
	//public String getString() {} // NO compila, falta el tiipo de retorno.
	
	//public String getOtherString(boolean test) { if(test) return "";  } // No compila, en caso de que sea false, no regresa ning�n valor.
	
	protected Exception getExc() {
		return new Exception();
	}
	
	public void test() throws Exception {
		throw getExc();
	}
	
	/*int getLong() {
		return 9L; // No compila, el tipo retornado no es compatible con el tipo esperado.
	}*/
	
	//public int 2getInt() { return 1;} // No compila, no se puede iniciar con un n�mero.
	
	//public void emptyList {} //No compila, no tiene lista de par�metros.
	
	//public void parameterList(int a; int b) {} // No compila, la lista de par�metros debe ir separada por comas.
	
	private void notBody(); // No compila, el m�todo no tiene cuerpo. Existen excepciones a esta regla que se ver�n en los m�todos abstractos.
}
