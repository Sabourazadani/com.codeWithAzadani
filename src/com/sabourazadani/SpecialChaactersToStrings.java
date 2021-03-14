package com.sabourazadani;

public class SpecialChaactersToStrings {

	public static void main(String[] args) {
		// How to add Special Characters to Strings
		// C:\Windows\...
		// \n
		// \t
		
		String message = "Hello Sabour Azadani";
		String message1 = "Hello Sabour \"Azadani\"";
		String message2 = "Hello:\\ Sabour \\ Azadani";
		String message3 = "c:\\Windows\\..."; 
		
		String message4 = "Hello\n Sabour \"Azadani\"";
		
		String message5 = "Hello\t Sabour\tAzadani";
		
		
		
		System.out.println(message);
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(message3);
		
		System.out.println(message4);
		
		System.out.println(message5);
		System.out.println(message5.toUpperCase());

	}

}
