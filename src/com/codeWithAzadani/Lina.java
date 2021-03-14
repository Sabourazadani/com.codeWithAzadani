package com.codeWithAzadani;

public class Lina {
	
	// static method
	public static void message () {
		System.out.println("Insdie the static method - print the message");
	}
	
	// non-static method
	public void messageTekSchool () {
		System.out.println("Inside a non-static method - print the messageTekSchool");
	}
	
	/**	
	  	We can call the static method message () using either Lina.message(); or message();
		On the other hand, call to a non-static method needs an instance of the Lina class:
	*/
	public static void main(String[] args) {
		Lina object = new Lina ();
		object.messageTekSchool ();
	}
	

}
