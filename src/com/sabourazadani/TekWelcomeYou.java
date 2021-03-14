package com.sabourazadani;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class TekWelcomeYou {

	public static void main(String[] args) {
		

		String tek = "Welcome to Our Next Online Java Course ! !'";
		String message = "It's presented by Tek School - Happy Learning Falcons ! ! ";
		
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		System.out.print("\n"+tek + "\n"+message + "\nDate: "+localDate +" - " +"Time: "+localTime);

	}
	


}
