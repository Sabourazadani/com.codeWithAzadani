package com.codeWithAzadani;

class Robot {
	public void speak(String message) {
		System.out.println(message);
	}
	public void jump(double height) {
		System.out.println("I am jumping " + height + " meters");
	}
	public void move(String direction, double distance) {
		System.out.println("& I am moving " + distance + " meters in direction " + direction);
	}
}

public class ClassRobot {

	public static void main(String[] args) {
		Robot facebook = new Robot();

		facebook.speak("Hi there, I am Facebook. ");
		facebook.jump(1.1);
		facebook.move("North", 15.5);
		
		
		
	}

}
