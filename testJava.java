//Write a Java Program to print numbers between 1 to 200 which are divisible by 5, 7 and by both.
package JavaProgram;

public class testJava {

	public static void main(String[] args) {
		
		int n =200;
		System.out.println("* By 5 divisible numbers are : ");
		for (int i = 1; i < 200; i++) {
			
			if (i % 5 == 0) {
				System.out.print(i+",");			
			}
			}
		         System.out.println("  ");
		         
		         System.out.println("* By 7 divisible numbers are : ");
			for (int j = 1; j < 200; j++) {
			if (j % 7 == 0) {
				System.out.print(j+",");
			}		
		}
			System.out.println("  ");
			
			System.out.println("* By 5 and 7 both divisible numbers are : ");
			for (int i = 1; i < 200; i++) {
			if (i % 5 == 0 &&i % 7 == 0) {
				System.out.print(i+",");
			}
		}
			System.out.println("  ");
			
		}
		

	}


