package WEEK1;

import java.util.Scanner;
public class CoumpoundInterest {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of P = ");
		long P = input.nextInt();
		
		System.out.println("Enter the value of r = ");
		double a = input.nextDouble();
		
		double r = a/100;
		
		System.out.println("Enter the value of n = ");
		int n = input.nextInt();
		
		System.out.println("Enter the value of t = ");
		int t = input.nextInt();
		
		double h = (1+r/n);
		double j = n*t;
		
		double k = Math.pow(h, j);
		
		double A = P*k;
		
		System.out.println("The Interest is "+A);
		
	}

}
