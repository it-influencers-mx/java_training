package com.accenture.chapter3;

public class ArreglosPrimitivos {
	public static void main(String args[]) {
		
		//Ejemplo 1 - Inicializaci�n de arreglos.
		int[] numbers = new int[3]; //Se crea un arreglo de 3 elementos. Se incializa en 0 cada uno de los elementos.
		int[] numbers1 = new int[] {1 , 2, 3};
		int[] numbers2 = {1 , 2 , 3}; //Arreglo inicializado de manera an�nima, es equivalente al anterior, pero en una versi�n m�s corta.
		int [] numbers3 = {};
		int numbers4[] = {};
		int numbers5    []   = {};
		int numbers6    [    ]   = {};
		int numbers7    [    ]   = new int [   5   ];
		//[]int numbers8 = new int [5]; 			//No compila, siempre se colocan los [] despu�s del tipo de dato.
		//int[] numbers9 = new int[3] {1 , 2, 3};  	//No compila. Cuando inicializamos el arreglo directamente, Java no nos permite especificar el tama�o.
		//int[2] numbers10 = new int[2];  			//No compila. Siempre se especificar� el tama�o del arreglo en la parte derecha de la declaraci�n, NUNCA en la izquierda.
		int[] numbers11;
		//numbers11 = {1, 2, 3}; 	//No compila. La inicializaci�n en una l�nea (Arreglo an�nimo) solo funciona cuando se utiliza en el momento de la declaraci�n.	
		numbers11 = new int[3];
		
		
		//Ejemplo 2 - Declarando m�ltiples variables en una sola l�nea.
		int[] arreglo1, arreglo2;  	//Las dos variables son arreglos.
		int arreglo3[], entero;		//Solo arreglo3 es arreglo, entero es un int normal.
		int[] arreglo4, matriz[];	//arreglo4 es un arreglo, matriz es una matriz.
	}
}
