package com.codeWithAzadani;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Enter a value till reach 5 in a scanner. 
		
		Scanner scanner = new Scanner (System.in);
		
		/* 
		  System.out.println("Enter a number until you got the right one: ");
		
		int value = scanner.nextInt();
		
		while (value != 7) {
			System.out.println("Enter a number until you got the right one: ");
			value = scanner.nextInt();
		}
		 System.out.println("Yeah !! You got the right number which is: 7");
		*/
		
		int value = 0; 
		do {
			System.out.println("Enter a number until you got the right one: ");
			value = scanner.nextInt();
		}
		while (value != 7);
		
		System.out.println("Yeah !! You got the right number which is: 7");
	}

}
