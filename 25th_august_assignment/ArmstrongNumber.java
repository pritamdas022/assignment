// CHECK ARMSTRONG NUMBER = 153(NO.OF DIGIT CONSIDER AS POWER)
package JavaProgram;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153, temp, remainder, result = 0;

        temp = num;

        while (temp != 0)
        {
            remainder = temp % 10;
            result += Math.pow(remainder, 3);
            temp /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }

	}


