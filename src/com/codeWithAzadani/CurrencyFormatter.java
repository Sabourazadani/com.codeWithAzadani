package com.codeWithAzadani;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String afghani = NumberFormat.getCurrencyInstance(new Locale("en", "afg")).format(payment);
		
		System.out.println("Us: " + us);
		System.out.println("China: " + china);
		System.out.println("Afghani: " + afghani);



	}
}
