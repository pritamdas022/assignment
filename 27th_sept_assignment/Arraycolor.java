package Array;
import java.util.*;
public class Arraycolor {

	public static void main(String[] args) {
//		creating scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int length = sc.nextInt();// taking input of the array size
		String a[]=new String[length];
		for (int i = 0; i < length; i++) {
			System.out.println("enter index "+(i+1)+"th colour : ");
			a[i] = sc.next();// storing elements from the input
			
		}
		System.out.println("Your collection of colours is : ");
		for (int i = 0; i < length; i++) {
			System.out.println(a[i]+",");
		}

	}

}
