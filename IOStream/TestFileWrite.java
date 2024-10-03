package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWrite {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\IO\\newTextFile.txt");
		
		char[]ch = {'h','i'};
		 
		file.write("12    ");
		file.write(23   );
		file.write("Sandeep   "); 
		file.write(ch   );
		
		file.close();
		System.out.println("data write successfully");
	}

}
