package com.codeWithAzadani;

public class ConstructorCar {
	
	public String companyName = "Chevrolet";
	public String model = "Camaro";
	public String color = "Red";
	public int year = 2021;
	public double price = 75_099.15;
	
	public String cheveCamaroHorsePower() {
		return "275 to 650 hp";	
	} 
	public String cheveCamaroMPG() {
		return "Up to 22 city / 30 highway";
	}
	public String cheveCamaroCurbWeight() {
		return "3,351 to 4,120 lbs";
	}
	public String cheveCamaroEngine() {
		return "2.0 L 4-cylinder, 3.6 L V6, 6.2 L V8";
	}
	public static void main(String[] args) {
		
		ConstructorCar ChevroletCamaro = new ConstructorCar ();
		
		System.out.println("\n 2021 Chevrolet Camaro Details");
		System.out.println(" *****************************");
		System.out.println("\n Company: "+ChevroletCamaro.companyName + "\n Model: "+ChevroletCamaro.model + 
				"\n Color: "+ChevroletCamaro.color +
				"\n Year: "+ChevroletCamaro.year + "\n Price: "+"$"+ChevroletCamaro.price + " US Dollars");
		
		System.out.println("\n Specification 2021 Camaro");
		System.out.println(" *************************");
		System.out.println("\n Horse Power: "+ChevroletCamaro.cheveCamaroHorsePower() + 
				"\n Camaro MPG: "+ChevroletCamaro.cheveCamaroHorsePower() + 
				"\n Curb Weight: "+ChevroletCamaro.cheveCamaroCurbWeight() +
				"\n Engine: "+ChevroletCamaro.cheveCamaroEngine());
	}
}
