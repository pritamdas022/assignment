// 1. Java program to find duplicate elements in an String array.
package String;
import java.util.*;
public class StringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length : ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.err.println("Enter string elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println("Duplicate string is : "+arr[j]);
					
				}
			}
		}

	}

}
