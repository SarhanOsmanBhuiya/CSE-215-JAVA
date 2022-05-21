package WEEK1;

import java.util.Scanner;
public class StringInputs {
	

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Name : ");
		String name = input.nextLine();

		System.out.println("Enter Your ID : ");
		String id = input.nextLine();
		
		System.out.println("Enter Your Age : ");
		int age = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Enter the Name of ypur University : ");
		String uni = input.nextLine();
		
		
		input.close();
		
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Age : "+age);
		System.out.println("University : "+uni);

	}

}
