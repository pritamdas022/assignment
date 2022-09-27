// Write a Java Program to reverse the array contents.
package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayreverse {

	public static void main(String[] args) {
//		 taking input 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n = sc.nextInt();// taking input of the array size
		
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array : ");
        for (int i = 0; i < arr.length; i++) {
        	arr[i]=sc.nextInt();// storing elements from the taking input
			}
//		reverse elements to the input elements
		for (int i = 0; i <arr.length/2; i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.print("Reverse array list is : "+Arrays.toString(arr));
	}

	}


