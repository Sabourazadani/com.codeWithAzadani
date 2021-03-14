package com.sabourazadani;

public class ArithmeticExpressions {

	public static void main(String[] args) {
		// Arithmetic Expressions
		// +, -, *, %
		// Order of Operators
		//   ()   Prantices always have highest priority ()
		//   */   then we have multiplication and division
		//   + -   and finally we have addition and subtractions
		
		int result = 10 + 3; 
		System.out.println(result);
		
		int result1 = 5 / 10; 
		System.out.println(result1);
		
		double result2 = (double) 5 / (double)10; 
		System.out.println(result2);
		
		int x = 1; 
		x++; 
		x %= 2; // Augmentic/compound Assignment operator 
		System.out.println(x);
		
		int x1 = 1;
		++x1; 
		System.out.println(x1);
		
		int x2 = 1;
		x--; 
		System.out.println(x2);
		
		int x3 = 1;
		--x; 
		System.out.println(x3);
		
		int x4 = 1;
		int y4 = x++; 
		System.out.println(x4);
		

	}

}
