import java.util.*;
import java.io.*;

public class Write{
	public static void main(String args[]) throws Exception{
		Random r = new Random();
		
		File file = new File("Task1.txt");
		if(file.exists()){
			System.out.println("File already exists");
			System.exit(0);
		}
		
		PrintWriter output = new PrintWriter(file);
		for(int i = 0; i < 100; i++){
			output.print(r.nextInt(100) + " ");
		}
		
		output.close();
	}
}
