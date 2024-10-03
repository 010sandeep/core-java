package IOStream;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
   
		File file = new File("c:\\");
		
		System.out.println("File is available =" + file.exists());
		
		if (file.exists()) {
			System.out.println("File name =" + file.exists());
		}else {
			System.out.println("file doesnt exsist");
		}
		
	}
}
