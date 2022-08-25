// CHECK LEAP YEAR OR NOT
package JavaProgram;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your year : ");
		int year = sc.nextInt();
		
		if((year%400==0)||(year%4==0)&&(year%100!=0)) {
			System.out.println(year+" is LEAP YEAR");
		}else {
			System.out.println(year+" is not LEAP YEAR");
		}
		

	}

}
