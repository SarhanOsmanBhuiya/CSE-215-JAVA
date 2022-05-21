/*
 2. Write a program that asks user for an arithmetic operator and two operands (say a and b). 
 Display result of the corresponding calculation using switch statement. 
 Enter the operator: (1: add 2: subtract 3: multiply 4: divide):
 Enter a: 50
 Enter b: 3
 Result: 150
 */


package WEEK2;

import java.util.Scanner;
public class Task2Calculator {

	public static void main(String[] args) 
	{	
		int d = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the operator : (1:add 2:subtract 3:multiply 4:divide) ");
		int c = input.nextInt();
		
		System.out.println("Enter a:");
		int a = input.nextInt();
		
		System.out.println("Enter b:");
		int b = input.nextInt();
		
		input.nextLine();
		
		switch(c)
		{
		case 1 : d=a+b;
		break;
		case 2 : d=a-b;
		break;
		case 3 : d=a*b;
		break;
		case 4 : d=a/b;
		break;
		}
		System.out.println("Result:"+d);
		
	}
}
