package com.accenture.chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreacion {
	
	public static void main(String args[]) {
		
		//Ejemplo 1 - Sin generics
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(20);
		ArrayList list3 = new ArrayList(list2);
		ArrayList list6 = new ArrayList<>();		
		ArrayList list7 = new ArrayList<String>();	//Al no especificar el generic en la declaración, se toma como si no tuviera generic.
		
		list1.add("Hola");
		list1.add(1);
		//String str = list1.get(0); // No compila. Cuando no usamos generics, los elementos son tratados como objects.
		String str1 = (String) list1.get(0); // Es necesario un cast explícito.
		
		
		
		//Ejemplo 2 - Con generics
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();
		list5.add("Hola");
		String str2 = list5.get(0); //No es necesario un cast explícito. Java identifica el tipo de dato del generic.
		
		
		
		//Ejemplo 3 - Usando List como referencia.
		List<String> list8 = new ArrayList<>();
		//ArrayList<String> list9 = new List<>(); // DOES NOT COMPILE
	}
	
}
