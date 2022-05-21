import java.io.*;
import java.util.*;

public class Write {
	public static void main(String args[]) throws IOException{
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Task3.dat"));){
			int a[] = {1,2,3,4,5};
			Date date = new Date();
			output.write(a);
			output.writeDouble(5.5);
			output.writeObject(date);
		}
	}
}
