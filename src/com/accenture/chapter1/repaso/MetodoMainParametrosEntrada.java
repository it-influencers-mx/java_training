package com.accenture.chapter1.repaso;

public class MetodoMainParametrosEntrada {
	
	public static void main(String[] args) {
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
}

class MetodoMainParametrosEntrada2 {
	
	public static void main(String... args) {
		System.out.println(args[1]);
		System.out.println(args[2]);
	}
	
}

class MetodoMainParametrosEntrada3 {
	
	public static void main(String[] args) {
		boolean isNull = args == null;
		boolean isEmpty = args.length == 0;
		System.out.println(isNull);
		System.out.println(isEmpty);
	}
	
}
