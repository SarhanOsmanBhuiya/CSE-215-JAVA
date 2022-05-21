package WEEK1;

import java.util.Scanner;
public class temperature {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Celcius = ");
		
		double c = input.nextInt();
		
		double f = (9*c/5)+32;
		
		System.out.println("Temperature in Fahrenheit is " +f);
		
	}

}
