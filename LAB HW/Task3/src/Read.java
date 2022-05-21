import java.util.*;
import java.io.*;

public class Read {
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("Task3.dat")))
		{
			double d = input.readDouble();
			Date date = (Date)(input.readObject());
			System.out.println(d+" "+date);
		}
	}
}
