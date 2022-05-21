/*3. The user should be allowed to enter one-digit positive integers until (s)he enters a negative integer. 
 * Convert all the valid inputs into a positive whole number and print it. 
 * Enter one-digit integers (enter negative to stop): 
 * 4
8
1
5
-3
Whole number: 4815*/

package WEEK3;

import java.util.Scanner;
public class Task3NewPositiveNumber 
{
public static void main(String[] args) 
	
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int n = input.nextInt();
		
		while(n>=0)
		{
			System.out.println("Enter another Integer : ");
			n = input.nextInt();
		if(n>=0){
		System.out.println(n);
		n++;
		}
		}
	}

}
