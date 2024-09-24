package CustomException;

public class DuplicateRecordException extends Exception{

	
	public DuplicateRecordException() {
		
		System.out.println("This Id Is Already Usses");
	}
	
}
