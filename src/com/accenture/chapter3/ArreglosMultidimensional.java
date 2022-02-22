package com.accenture.chapter3;

public class ArreglosMultidimensional {
	public static void main(String args[]) {
		
		String[] arreglo = new String[4];
		StringBuilder[] arreglo1 = new StringBuilder[3];
		arreglo.equals(arreglo1);
		
		boolean a = arreglo1 == arreglo;
		
		
		//Ejemplo 1 - Declarando arreglos multidimensionales
		System.out.println("1-------------------------");
		int[][] vars1; 				// 2D array
		int vars2 [][];				// 2D array
		int[] vars3[]; 				// 2D array
		int[] vars4 [], space [][]; // a 2D AND a 3D array
		
		
		
		//Ejemplo 2 - Definiendo el tamaño del arreglo
		System.out.println("2-------------------------");
		String [][] rectangle = new String[3][2];
		rectangle[0][1] = "set";
		
		
		
		//Ejemplo 3 - Arreglos asimétricos
		System.out.println("3-------------------------");
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		
		
		int[][] argsA = new int[4][];
		argsA[0] = new int[5];
		argsA[1] = new int[3];
		System.out.println(argsA[0][0]); 	//0
		System.out.println(argsA[2]); 		//null
		System.out.println(argsA[3]); 		//null
		//System.out.println(argsA[1][3]); 	//ArrayIndexOutOfBoundsException
		//System.out.println(argsA[3][0]); 	//NullPointerException
		
		
		
		//Ejemplo 4 - Utilizando un Arreglo Multidimensional
		System.out.println("4-------------------------");
		
		int[][] twoD = new int[3][2];
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for (int[] inner : twoD) {
			for (int num : inner) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
