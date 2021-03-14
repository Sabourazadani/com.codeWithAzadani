package com.codeWithAzadani;

public class PowerToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10, y = 5;
		int result = 1;
        
        //Copying the exponent value to the loop counter
        int i = y;
        for (;i != 0; --i)
        {
            result *= x;
        }
        System.out.println(x + "^" + y + " = " + result);

	}

}
