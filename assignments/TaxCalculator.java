package com.cognizant.tax;
// class 1
public class TaxCalculator {
//	instance variable
	float basicSalary;// taking float variable
	boolean citizenship;// taking boolean variable
//	method 1 for calculating tax
	public void calculateTax() {
		int tax =(int)( 30*basicSalary/100);// given logic to calculating tax,typecasting to convert float to int 
		System.out.println("The Tax of the employee for the "+basicSalary+" is "+tax);// output
	}
//	method 2 to get nettsalary
	public void deductTax() {
		float tax = 30*basicSalary/100;
		int nettSalary;
		nettSalary=(int)tax;// type casting to convert float to int
		System.out.println("The salary of the employee : "+nettSalary);// output
	}
	// method 3 checking citizenship eligibility
	public void validateSalary() {
		if (basicSalary>100000||citizenship==true) {// if condition id stishfied then,
			System.out.println("The citizanship eligibility :true");// it will be print
		}else {
			System.out.println("The citizanship eligibility :false");// otherwise it will be print
		}
		
	}

}
