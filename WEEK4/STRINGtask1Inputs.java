package WEEK4;

import java.util.Scanner;
public class STRINGtask1Inputs {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name : "); 
		String s1 = input.nextLine();
		
		int j= s1.length();
		char a= s1.charAt(j-1);
		String s2= s1.toUpperCase();
		
		System.out.println("Length :"+j);
		System.out.println("Character at last index : "+a);
		System.out.println("Upper Case : "+s2);

	}

}
