package CustomException;

public class TestDuplicateRecordException  {
	
	public static void main(String[] args) throws DuplicateRecordException {
		
		String login = "sandeep1874348979847";
		
		if (login =="sandeep123") {
			 
			throw new  DuplicateRecordException();
		}else {
			
			System.out.println("you Are Successfully Login");
		}
		
		
	}

}
