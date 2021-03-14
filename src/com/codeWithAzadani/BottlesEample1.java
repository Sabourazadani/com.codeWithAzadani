package com.codeWithAzadani;

public class BottlesEample1 {

	public static void main(String[] args) {
		/** bottle counts - 99 bottles of water on the wall
		 * 	Take one down and pass it around until 1 bottle of water on the wall
		 * 	Take one down and pass it around, no more bottles of water on the wall.
		 */
		int waterNumber = 99;
	    String word = "bottles";
	    
	    	while (waterNumber > 0) {
	    		if (waterNumber == 1) {
	    			word = "bottle"; // singular, as in ONE bottle.
	    			} 
	    			System.out.print(waterNumber + " " + word + " of water on the wall");
	    			System.out.println(", " + waterNumber + " " + word + " of water.");
	    			System.out.print("Take one down and ");
	    			System.out.print("pass it around, ");
	    		
	    		waterNumber = waterNumber - 1;
	    		
	    		if (waterNumber > 0) {
	    			System.out.println(waterNumber + " " + word + " of water on the wall.");
	    			System.out.println(" ");
	    			} else {
	    			System.out.println("no more bottles of water on the wall.");
	        } // end else
	     } // end while loop
	   } // end main method
	 } // end class
