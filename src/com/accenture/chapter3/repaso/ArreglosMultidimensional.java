package com.accenture.chapter3.repaso;

public class ArreglosMultidimensional {
	public static void main(String args[]) {
		
		//Ejemplo 1
		System.out.println("1-------------------------");
		int[] vars4 [], space [][]; 
		int[][] vars1; 				
		int vars2 [][];				
		int[] vars3[]; 				
		[]int vars6[]; 
		
		
		
		//Ejemplo 2
		System.out.println("2-------------------------");
		String [][] a = new String[3][2];
		a[0][1] = "hola";
		a[1][2] = "mundo";
		System.out.println(a[0][1]);
		System.out.println(a[1][2]);
		
		
		
		//Ejemplo 3
		System.out.println("3-------------------------");
		int[][] differentSize = { {1, 4}, {3}, {9,8,7} };
		System.out.println(differentSize[2][2]);
		
		
		
		//Ejemplo 4
		System.out.println("4-------------------------");
		int [][] argsA = new int[4][];
		argsA[0] = new int[5];
		argsA[1] = new int[3];
		System.out.println(argsA[0][0]); 	
		System.out.println(argsA[2]); 		
		System.out.println(argsA[1].length);
		
		
		
		//Ejemplo 5
		System.out.println("5-------------------------");
		int[][] differentSize1 = { {1, 4}, {3}, {9,8,7} };

		for(int[] i : differentSize1)
			for(int j : i) 
				System.out.print(j + " ");
	}
}
