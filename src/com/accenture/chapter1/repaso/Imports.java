package com.accenture.chapter1.repaso;

import java.util.ArrayList;
import java.util.List;
import java.util.*; //Redundante
import java.lang.*; //Redundante, java.lang.* es importado impl�citamente en todas las clases.
import java.util.ArrayList; //Sigue compilando a�n y cuando ya lo hab�a colocado anteriormente.
import java.lang.System; //Redundante, java.lang.* es importado impl�citamente en todas las clases.

public class Imports {
	
	Constructores constructores;
	MetodoMain metodoMain;
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list);
	}
}
