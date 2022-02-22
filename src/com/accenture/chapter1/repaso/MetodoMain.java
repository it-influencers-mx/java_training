package com.accenture.chapter1.repaso;

public class MetodoMain {
	//V�lido
	public static void main(String... str) { 
		
	}
}

class MetodoMain2 {
	//NO V�lido. Debe ser static
	public void main(String args[]) {
		
	}
}

class MetodoMain3 {
	//V�lido
	public static void main(String args[]) {
		return;
	}
}

class MetodoMain4 {
	//NO V�lido. Debe tener tipo de retorno void.
	public static int main(String[] args) {
		return 0;
	}
}

class MetodoMain5 {
	//NO V�lido. Debe tener modificador de acceso public.
	protected static void main(String[] args) {
		
	}
}

class MetodoMain6 {
	//NO V�lido. Debe tener como argumento un arreglo o varargs
	public static void main(String args) {
		
	}
}

class MetodoMain7 {
	//NO V�lido. Debe tener el nombre main en min�scula.
	public static void Main(String[] args) {
		
	}
}