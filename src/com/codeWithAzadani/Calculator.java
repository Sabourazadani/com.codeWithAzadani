package com.codeWithAzadani;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Code for calculator

		double num1;
		double num2;
		char operator;
		double answer = 0.0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your first number?");

		num1 = scanner.nextInt();
		System.out.println("please select your prefered operator from  +, *, -, /");

		operator = scanner.next().charAt(0);
		System.out.println("Please enter your second number?");

		num2 = scanner.nextInt();
		if (operator == '+') {
			answer = num1 + num2;
		}
		if (operator == '-') {
			answer = num1 - num2;
		}
		if (operator == '*') {
			answer = num1 * num2;
		}
		if (operator == '/') {
			answer = num1 / num2;
		}
		System.out.println(num1 + " "+ operator + " " + num2 + " = " + answer);

	}

}
