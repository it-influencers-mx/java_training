package com.accenture.chapter5.inheritance;

public class MethodOverridingVsHiding {
	public static void main(String[] args) {
		//Estático
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();
		
		//Instancia
		//KangarooInstancia joey2 = new KangarooInstancia();
		//joey2.getMarsupialDescription();
		//joey2.getKangarooDescription();
	}
}

//Ejemplo 1 - Estático
class Marsupial {
	public static boolean isBiped() {
		return false;
	}

	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}

class Kangaroo extends Marsupial {
	public static boolean isBiped() {
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
}

//Ejemplo 2 - Instancia
class MarsupialInstancia {
	public boolean isBiped() {
		return false;
	}

	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
}

class KangarooInstancia extends MarsupialInstancia {
	public boolean isBiped() {
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
}
