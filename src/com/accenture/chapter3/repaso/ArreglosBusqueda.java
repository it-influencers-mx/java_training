package com.accenture.chapter3.repaso;

import java.util.Arrays;

public class ArreglosBusqueda {
	public static void main(String[] args) {
		//Ejemplo 1
		System.out.println("1-------------------------");
		int[] nums = {7 , 4, -1, 6};
		Arrays.sort(nums);
		System.out.println(Arrays.binarySearch(nums, 2)); 
		System.out.println(Arrays.binarySearch(nums, -1));
		
		
		
		//Ejemplo 2
		System.out.println("2-------------------------");
		int[] numbers = new int[] {9 , 6 , 10 , 5};
		System.out.println(Arrays.binarySearch(numbers, 4));
		System.out.println(Arrays.binarySearch(numbers, 6));
		
		
		
		//Ejemplo 3
		System.out.println("3-------------------------");
		int[] otherNums = new int[] {1, 5, 10};
		System.out.println(Arrays.binarySearch(otherNums, 1));
		System.out.println(Arrays.binarySearch(otherNums, 0));
		
		
		
		//Ejemplo 4
		System.out.println("4-------------------------");
		Object[] objects = { new Object(), new Object(), new Object() };
		System.out.println(Arrays.binarySearch(objects, new Object()));
	}
}
