package WEEK3;

import java.util.Scanner;
public class Task1Combination {
	

	public static int factorial(int n)
	{	
	
		int fact =1;
		
	for (int i=1;i<=n;i++)
		{
		fact = fact*i;
		}
	return fact;
	}

	public static void main(String[] args) 
	
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = input.nextInt();

		System.out.println("Enter the value of r :");
		int r = input.nextInt();
		
		double combination = factorial(n)/(factorial(r)*factorial(n-r));
		
		System.out.println("COMBINATION = "+combination);
		
		
				
				
	}

}
