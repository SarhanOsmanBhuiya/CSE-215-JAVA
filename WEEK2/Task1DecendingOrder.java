/*1. Write a program which will use while loop to print all the integers 
between 100 and 150 which are divisible by 8 in descending order.
Expected output: 144 136 128 120 112 104*/



package WEEK2;

public class Task1DecendingOrder 
{
	  public static void main(String[] args) 
	  { 
	       int n;
		while( n<=150 && n>=100);
	    {if(n % 8 == 0)
	        	
	       System.out.println(n);  
	    }
	    n--;
	  }

}
