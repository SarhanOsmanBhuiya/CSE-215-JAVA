package WEEK3;

import java.util.Scanner;
public class Task2Parameter {
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int n = input.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
	}
}
