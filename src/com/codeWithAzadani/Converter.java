package com.codeWithAzadani;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Converter {

	public static void main(String[] args) {
		// create input box from JOptionPane Class
		// Convert Once into Cup
		
		String input = JOptionPane.showInputDialog(null, 
				"Please enter the Once you want to convert into");
		
		double onces = Double.parseDouble(input); 
		
		double cup = onces / 8; 
		DecimalFormat object = new DecimalFormat ("#.00");
		String cupDecimal = object.format(cup);
		
		JOptionPane.showInputDialog(null, 
				"\nTotal Once: "+ onces +
				"\nTotal Cup: " + cupDecimal);
		
		// Once into pint
		double pint = onces / 16; 
		DecimalFormat object1 = new DecimalFormat ("#.00");
		String pintDecimal = object1.format(pint);
		JOptionPane.showInputDialog(null, 
				"\nTotal Once: "+ onces + 
				"\nTotal Cup: "+ cupDecimal + 
				"\nTotal Pint: "+ pintDecimal);
		
		//Once into Quarter
		double quarterDecimal = onces / 32; 
		DecimalFormat object2 = new DecimalFormat ("#.00");

		
		

	}

}
