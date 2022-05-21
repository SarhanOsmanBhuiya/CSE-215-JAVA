import java.util.*;
import java.io.*;

public class Read {
	public static void main(String args[]) throws ClassNotFoundException, IOException{
		try(DataInputStream input = new DataInputStream(new FileInputStream("Task2.dat"));)
		{
			int x = 0;
			while(true){
				x += input.readInt(); 
				System.out.println(x);
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
