package Sallary;

 class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
	
	 Employee(long id,String Name,String address,long phone){
		employeeId = id;
		employeeName = Name;
		employeeAddress = address;
		employeePhone = phone;
	}
	public double calculateSalary() {
		
		double salary = basicSalary + (basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
		return salary;
	}
	public double calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		return transportAllowance;
		
	}
 }
 class Manager extends Employee{
	 
	  Manager(long id,String Name,String address,long phone,double salary){
		 super(id,Name,address,phone);
		 basicSalary=salary;
		 
	 }
 }
 class Trainee extends Employee{
	 
	 Trainee(long id,String Name,String address,long phone,double salary){
		 super(id,Name,address,phone);
		 basicSalary=salary;
	 }
	 
 }

	
public class InheritanceActivity{
	public static void main(String[] args) {
		Manager m = new Manager(126534,"Peter","Chennai India",237844,65000);
		Trainee t = new Trainee(29846,"jack","Mumbai india",442085,45000);
		System.out.println("salary of Manager :"+m.calculateSalary());
		System.out.println("Transport Allowance for manager :"+m.calculateTransportAllowance());
		
		System.out.println("salary of Trainee : "+t.calculateSalary());
		System.out.println("TransportAllowance for Trainee :"+t.calculateTransportAllowance());

	}
}

