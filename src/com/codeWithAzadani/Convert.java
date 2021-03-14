package com.codeWithAzadani;

import java.util.Scanner;

public class Convert {

	int num;

	void getVal() {
		System.out.println("Decimal to HexaDecimal,Octal and Binary");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		num = Integer.parseInt(scan.nextLine());
	}

	void convert() {
		String hexa = Integer.toHexString(num);
		System.out.println("HexaDecimal Value is : " + hexa);
		String octal = Integer.toOctalString(num);
		System.out.println("Octal Value is : " + octal);
		String binary = Integer.toBinaryString(num);
		System.out.println("Binary Value is : " + binary);
	}
}

class Decimal_Conversion {
	public static void main(String args[]) {
		Convert obj = new Convert();
		obj.getVal();
		obj.convert();
	}

}
