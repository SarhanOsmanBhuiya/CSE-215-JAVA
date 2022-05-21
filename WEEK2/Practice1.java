/*
 * Practice-1: Take an integer input from user and print 
 * (i)“Positive” if it is greater than 0 
 * (ii)“Negative” if it is less than 0 
 * (iii)“Zero” otherwise.
 */


package WEEK2;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int x = input.nextInt();
		input.close();
		
		if(x>0)
			System.out.println("Positive");
			
		else if(x<0)
			System.out.println("Negative");
			
		else
			System.out.println("Zero");
		}

}
