//1. WAJP to get a number from the user and print whether it is positive or negative.
package JavaProgram;
import java.util.*;

public class Positive_Negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number :");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("Your number" +num+ "is positive");
		}else if(num<0) {
			System.out.println("Your number" +num+ "is negative");
		}else {
			System.out.println("Your number" +num+ "is neither Posetive_Negative");
		}
		

	}

}
