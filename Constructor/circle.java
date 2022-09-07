package com.innovation.shapes;
import java.util.*;
public class circle {
//	instance variables
	private float redius;
	static float pi = 3.5F;
//	constructor 1
	public circle() {
		redius = 1.5F;
	}
//	constructor 2
	circle(float redius) {
		this.redius = redius;
	}
//	constructor 3
	public circle(float redius, float pi) {
		this.redius = redius;
	}
	
	// methods
	static float calculateCircleArea(float redius) {	
		return pi*redius*redius;	
	}
	static float calculateCircumference(float redius) {
		return 2*pi*redius;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the redius : ");
		float redius = sc.nextFloat();
		System.out.println("Circle Area is: "+calculateCircleArea(redius));
		System.out.println("Circumference is: "+calculateCircumference(redius));

	}

}
