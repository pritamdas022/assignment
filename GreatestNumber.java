//3. Take three numbers from the user and print the greatest number.

package JavaProgram;
import java.util.*;
public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number a : ");
		int a = sc.nextInt();
		System.out.print("Enter your second number b : ");
		int b = sc.nextInt();
		System.out.print("Enter your third number c : ");
		int c =sc.nextInt();
		if(a>b)
			if(a>c) 
				System.out.println("Your gratest number is : "+a);
		if(b>a)
			if(b>c)
				System.out.println("your gratest number is : "+b);
		if(c>a)
			if(c>b)
				System.out.println("your greatest number is : "+c);
				
			
	}

}
