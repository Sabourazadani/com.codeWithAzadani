package com.codeWithAzadani;

public class EqualMethod {

	public static void main(String[] args) {
		// == & .equal 
		
		
		/* Why I get false when I compare Double type with same value? */
		
		Double value1 = 5.5;
        Double value2 = 5.5;
        
        /* 	If you think, two objects created with references pointing to different locations, 
         	then why I get true with Integer? */
        System.out.println(value1 == value2 ); // Why false? 
        System.out.println(value1.equals(value2));
  
        
        Integer number1 = 5;
        Integer number2 = 5;
        
        System.out.println(number1 == number2); // If pointing to different objects, then why true? 
        System.out.println(number1.equals(number2));
        
	}

}
