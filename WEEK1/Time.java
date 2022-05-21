package WEEK1;

import java.util.Scanner;
public class Time {
	
	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);
		 
	      System.out.print("Enter time in seconds: ");
	      int sec = input.nextInt();
	 
	      int hours = sec / 3600;
	      int minutes = (sec % 3600) / 60;
	      int seconds = (sec % 3600) % 60;
	 
	      System.out.println(""+sec+"seconds is equivalent to '"+hours+"hours,"+minutes+"minutes,"+seconds+"seconds'");
		
	}

}
