package com.sabourazadani;

public class BottlesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String s = "s";
		    for (int numberOfBottles=99; numberOfBottles>-1;)
		      {
		      System.out.print(numberOfBottles + " bottle" + s + " of beer on the wall, ");
		      System.out.println(numberOfBottles + " bottle" + s + " of beer, ");
		      if (numberOfBottles==0)
		        {
		        System.out.print("Go to the store, buy some more, ");
		        System.out.println("99 bottles of beer on the wall.\n");
		        System.exit(0);
		        }
		      else
		        System.out.print("Take one down, pass it around, ");
		      s = (--numberOfBottles == 1)?"":"s";
		      System.out.println(numberOfBottles + " bottle" + s + " of beer on the wall.\n");
		      }

	}

}
