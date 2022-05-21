import java.util.Scanner;
import java.io.*;

public class Read {
	public static void main(String args[]) throws Exception{
		File file = new File("Task1.txt");
		Scanner input = new Scanner(file);
		
		while(input.hasNext()){
			int x = input.nextInt();
			System.out.print(x+" ");
		}
	}
}
