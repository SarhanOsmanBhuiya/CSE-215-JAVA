import java.util.*;
import java.io.*;

public class Write {
	public static void main(String args[]) throws ClassNotFoundException, IOException{
		Random r = new Random();
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("Task2.dat"));)
		{
			for(int i = 1; i <= 5; i++){
				output.writeInt(r.nextInt(5));
			}
		}
		
		try(DataInputStream input = new DataInputStream(new FileInputStream("Task2.dat"));)
		{
			while(true){
				System.out.println(input.readInt());
			}
		}
		catch(EOFException ex){
			System.out.println("All data were read");
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}
