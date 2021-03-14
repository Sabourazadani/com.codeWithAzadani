package com.sabourazadani;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// Arrays: Arrays have fixed length 
		// dimensional Arrays
		
		int number = 1; 
		System.out.println(number);
		
		int [] number1 = new int [5];  //change the name of the variables
		
		
		int [] numbers = new int [5]; // We are dealing with numbers
		numbers[0] = 1;
		numbers[1] = 2;
		
		int [] numbers1 = { 3, 2, 1, 4, 5,};
		Arrays.sort(numbers1);
		System.out.println(Arrays.toString(numbers1));
		
		
		System.out.println(numbers1.length);
		
		int [][] numbers2 = new int [2][3];
		numbers2 [0][0] = 1; 
		
		System.out.println(Arrays.deepToString(numbers2));
		
		int [] [] numbers3 = {  {1, 2, 3} , {4, 5, 6} };
		System.out.println(Arrays.deepToString(numbers3));
	}

}
