package com.sabourazadani;

public class Strings {

	public static void main(String[] args) {
		// Strings
		String message = new String ("Hello World");
		String message1 = "            Hello World" + "!!";
		

		System.out.println(message.endsWith("World"));
		System.out.println(message);
		System.out.println(message1);
		System.out.println(message1.length());
		System.out.println(message1.indexOf("W"));
		System.out.println(message1.replace("!!", "**"));
		System.out.println(message1);
		System.out.println(message1.toUpperCase());
		System.out.println(message1.trim());
	}

}
