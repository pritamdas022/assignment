/*problem statement:
  
  Develop a class "Rectangle" inside a package "com.cognizant.shapes" the class should have a method called
  calculateArea() which should print a message "the Area of the Rectangle is calculate using the formula length*breadth".
  Develop another class "AreaCalculator" inside the package "com.cognizant.shapes" add a main method which invokes the
  calculateArea of the rectangle object*/

package com.cognizant.shapes;

class Rectangle{
	void calculateArea() {
		System.out.println("the Area of the Rectangle is calculate using the formula length*breadth");
	}
}

public class Areacalculator {

	public static void main(String[] args) {
	Rectangle area = new Rectangle();
	area.calculateArea();

	}

}
