package ExceptionHandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingAssignment {
// main method
	public static void main(String[] args) {
//		creating scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers :");
		try { // outer try block
			try { // inner try block
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(" "+x/y);
			} catch (InputMismatchException e) { // catch block in inner try block
				System.out.println(e);
			}
		} catch (Exception e) { // catch block in outer try block
			System.out.println(e);
		}

	}

}
