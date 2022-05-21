/*
 3. Ask user for obtained mark and display the corresponding grade according to the following table:
90-100
A
80-89
B
70-79
C
60-69
D
Below 60
F
 */



package WEEK2;

import java.util.Scanner;
public class Task3Grades {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter obtained marks : ");
		double x = input.nextDouble();
		input.close();
		
		if(x>=90 && x<=100)
			System.out.println("A");
			
		else if(x>=80 && x<=89)
			System.out.println("B");
		
		else if(x>=70 && x<=79)
			System.out.println("C");

		else if(x>=60 && x<=69)
			System.out.println("D");

		else 
			System.out.println("F");


	}
}
