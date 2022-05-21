/*
 * 3. Write a method that checks the following conditions to check whether a string is a valid password or not.
A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits.
 */



package WEEK4;

import java.util.Scanner;
public class STRINGtask3Password {

	public static void main(String[] args) 
	{	String s = new String();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Password : "); 
		String s1 = input.nextLine();
		input.close();
		
		int i = pass(s);
		if(i==1)
			System.out.println("Entered password is valid");
		else
			System.out.println("Entered password is not valid");
	}


public static int pass(String s)
	{
		int i=1, k=0;
		char[] a=s.toCharArray();
		if(s.length()<8)i=0;
		else if(s.length()>8)
		{
			for(int j=0;j<s.length();j++)
			{
				if(a[j]>='a' && a[j]<='z') continue;
				
				else if(a[j]>='0' && a[j]<='9')k++;
				
				else i=0;
			}
			if(k<2)i=0;
		}
		return i;
	}
}
