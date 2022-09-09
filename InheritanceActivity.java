package Sallary;
// problem 1
 class Employee {
//	 declaring instance variable
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
//	creating overloaded construction
	 Employee(long id,String Name,String address,long phone){
		employeeId = id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
	}
//	 method calculateSalary
	public double calculateSalary() {
		
		double salary = basicSalary + (basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		return salary;
	}
//	problem 2
//	Adding default transport allowance method
	public double calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		return transportAllowance;
		
	}
 }
 //	 deriving manager class from employee class
 class Manager extends Employee{
// overloaded constructor
	  Manager(long id,String Name,String address,long phone,double salary){
//		  using super class to overloading the parent class
		 super(id,Name,address,phone);
		 basicSalary=salary;
		 
	 }
 }
 //	 deriving trainee class from employee class
  class Trainee extends Employee{
// overloaded constructor
	 Trainee(long id,String Name,String address,long phone,double salary){
//		  using super class to overloading the parent class
		 super(id,Name,address,phone);
		 basicSalary=salary;
	 }
	 
 }

//	main class
public class InheritanceActivity{
	public static void main(String[] args) {
//		creating objects
		Manager m = new Manager(126534,"Peter","Chennai India",237844,65000);
		Trainee t = new Trainee(29846,"jack","Mumbai india",442085,45000);
		
//		output calculateSalary and calculateAllowence with manager object
		System.out.println("salary of Manager :"+m.calculateSalary());
		System.out.println("Transport Allowance for manager :"+m.calculateTransportAllowance());
		
//		output calculateSalary and calculateAllowence with Trainee object
		System.out.println("salary of Trainee : "+t.calculateSalary());
		System.out.println("TransportAllowance for Trainee :"+t.calculateTransportAllowance());

	}
}

