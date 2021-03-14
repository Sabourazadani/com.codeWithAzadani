package com.codeWithAzadani;

class Person {
	String name;
	int age;

	void speak() {
		System.out.println("\nHi everyone! My name is " + name + " and I am " + age + " years old.");
	}
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
}

public class ClassPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		person.name = "Sabour Azadani";
		person.age = 28;
		person.speak();
		int years = person.calculateYearsToRetirement();
		System.out.println("My years till retirment is " + years + " years more!");

		Person person1 = new Person();
		person1.name = "Neelab Fazly";
		person1.age = 24;
		person1.speak();
		int years1 = person1.calculateYearsToRetirement();
		System.out.println("My years till retirment is " + years1 + " years more!");

	}
}
