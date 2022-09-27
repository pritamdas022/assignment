// Java Program to find average of an int Array.
package Array;
import java.util.*;
public class ArrayAv {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
//		for taking input and storing element in array 
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();
		
		int num []= new int[n];
		System.out.println("Enter the elements of an array : ");
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
			
		}
//		calculating and printing average number in an array list
		for (int j = 0; j < num.length; j++) {
			sum = sum+num[j];
		}
		avg=sum/n;
		System.out.println("The average value is : "+avg);

	}

}
