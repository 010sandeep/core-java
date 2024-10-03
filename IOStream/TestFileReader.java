package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFileReader {

	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\IO\\hello.txt");
		
		int ch = file.read();
		char chr;
		
		while (ch!=-1) {
			chr = (char)ch;
			System.out.print(chr);
			ch = file.read();
		}
		file.close();
		
	}
}
