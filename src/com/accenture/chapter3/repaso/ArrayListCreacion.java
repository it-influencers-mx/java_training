package com.accenture.chapter3.repaso;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreacion {
	
	public static void main(String args[]) {
		
		//Ejemplo 1
		ArrayList list1 = new ArrayList(20);
		System.out.println(list1.size());
		
		
		
		//Ejemplo 2
		ArrayList list2 = new ArrayList();
		list2.add("1"); list2.add(2); list2.add("3");
		ArrayList list3 = new ArrayList(list2);
		System.out.println(list3.size());
		System.out.println(list3);
		
		
		
		//Ejemplo 3
		ArrayList list4 = new ArrayList();
		list4.add("Hola");
		String str = list4.get(0); 
		System.out.println(str);
		
		
		
		//Ejemplo 4
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("Hola");
		list5.add("Mundo");
		System.out.println(list5);
		
		
		
		//Ejemplo 5
		ArrayList<String> list6 = new ArrayList<String>();
		list6.add("1");
		list6.add(2);
		list6.add("3");
		System.out.println(list6.size());
	}
	
}
