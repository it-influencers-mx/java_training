package com.accenture.chapter1.repaso;

public class MetodoMain {
	//Válido
	public static void main(String... str) { 
		
	}
}

class MetodoMain2 {
	//NO Válido. Debe ser static
	public void main(String args[]) {
		
	}
}

class MetodoMain3 {
	//Válido
	public static void main(String args[]) {
		return;
	}
}

class MetodoMain4 {
	//NO Válido. Debe tener tipo de retorno void.
	public static int main(String[] args) {
		return 0;
	}
}

class MetodoMain5 {
	//NO Válido. Debe tener modificador de acceso public.
	protected static void main(String[] args) {
		
	}
}

class MetodoMain6 {
	//NO Válido. Debe tener como argumento un arreglo o varargs
	public static void main(String args) {
		
	}
}

class MetodoMain7 {
	//NO Válido. Debe tener el nombre main en minúscula.
	public static void Main(String[] args) {
		
	}
}