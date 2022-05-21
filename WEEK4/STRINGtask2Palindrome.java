package WEEK4;

import java.util.Scanner;
public class STRINGtask2Palindrome {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : "); 
		String s1 = input.nextLine();
		input.close();
		String reverse= new String();
		
		int j= s1.length();
		
		for(int i=j-1;i>=0;i--)
		{
			reverse = reverse + s1.charAt(i);
		}
			
			if(s1.equalsIgnoreCase(reverse))
			{
				System.out.println("Enter string is Palindrome");
			}
			else
				System.out.println("Enter string is not Palindrome");
		}

	}

