package com.cognizant.tax;
// another class
public class EmployeeTax {
// main method
	public static void main(String[] args) {
//		creating class 1 object
		TaxCalculator t = new TaxCalculator();
		System.out.println("Test case 1 : ");
		t.basicSalary=25000;// defined basic salary
		t.calculateTax();//invoking 1st method
		t.deductTax();// invoking 2nd method
		t.validateSalary();// invoking 3rd method
		System.out.println("Test case 2 : ");
		t.basicSalary=125000;
		t.calculateTax();// invoking 1st method
		t.deductTax();// invoking 2nd method
		t.validateSalary(); //invoking 3rd method
		
	}

}
