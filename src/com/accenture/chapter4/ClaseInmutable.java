package com.accenture.chapter4;

//Ejemplo 1
public class ClaseInmutable {

	private int numberEggs;
	
	public ClaseInmutable(int numberEggs) {
		this.numberEggs = numberEggs;
	}
	
	public int getNumberEggs() {
		return numberEggs;
	}
}

//Ejemplo 2 - Clase aparentemente inmutable
class NotImmutable {
	private StringBuilder builder;

	public NotImmutable(StringBuilder b) {
		builder = b;
	}

	public StringBuilder getBuilder() {
		return builder;
	}

	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("initial");
		
		NotImmutable problem = new NotImmutable(sb);
		
		sb.append(" added");								//El objeto interno es modificado
		
		StringBuilder gotBuilder = problem.getBuilder();
		
		gotBuilder.append(" more");							//El objeto interno es modificado
		
		System.out.println(problem.getBuilder());			//initial added more
	}
}

//Ejemplo 3 - Clase inmutable - Copia defensiva
class NotImmutableV2 {
	private StringBuilder builder;

	public NotImmutableV2(StringBuilder b) {
		builder = new StringBuilder(b);
	}

	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}

	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("initial");
		NotImmutableV2 problem = new NotImmutableV2(sb);
		
		sb.append(" added");								
		
		StringBuilder gotBuilder = problem.getBuilder();
		
		gotBuilder.append(" more");							
		
		System.out.println(problem.getBuilder());			//initial
	}
}
